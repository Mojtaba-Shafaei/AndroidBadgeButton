package com.mojtaba_shafaei.androidToolbarBadgeButton

import android.content.Context
import android.content.res.ColorStateList
import android.graphics.Bitmap
import android.graphics.Typeface
import android.graphics.drawable.Drawable
import android.util.AttributeSet
import android.view.LayoutInflater
import android.view.View
import android.widget.FrameLayout
import androidx.annotation.ColorInt
import androidx.annotation.DrawableRes
import androidx.core.content.ContextCompat
import androidx.core.graphics.drawable.DrawableCompat
import com.mojtaba_shafaei.android.androidToolbarBadgeButton.R
import com.mojtaba_shafaei.android.androidToolbarBadgeButton.databinding.BadgeButtonLayoutBinding

class BadgeButton : FrameLayout {
    private var _binding: BadgeButtonLayoutBinding? = null
    private val binding get() = _binding!!

    constructor(context: Context) : super(context) {
        init(context)
    }


    constructor (context: Context, attrs: AttributeSet) : super(context, attrs) {
        init(context)
        readAttrs(context, attrs)
    }

    constructor (context: Context, attrs: AttributeSet, defStyleAttr: Int) : super(context, attrs, defStyleAttr) {
        init(context)
        readAttrs(context, attrs)
    }

    private fun readAttrs(context: Context, attrs: AttributeSet) {
        val a = context.theme.obtainStyledAttributes(attrs, R.styleable.BadgeButton, 0, 0)

        try {
            val bg = a.getResourceId(R.styleable.BadgeButton_badgeBackground, 0)
            if (bg != 0) {
                binding.tvBadge.setBackgroundResource(bg)
            }

            if (a.hasValue(R.styleable.BadgeButton_icon)) {
                val icon = a.getResourceId(R.styleable.BadgeButton_icon, 0)
                if (icon != 0)
                    binding.ivIcon.setImageResource(icon)
            }

            if (a.hasValue(R.styleable.BadgeButton_badgeTextColor)) {
                val textColor = a.getResourceId(R.styleable.BadgeButton_badgeTextColor, 0)
                binding.tvBadge.setTextColor(ContextCompat.getColor(context, textColor))
            }

        } finally {
            a.recycle()
        }
    }

    private fun init(context: Context) {
        _binding = BadgeButtonLayoutBinding.inflate(
            LayoutInflater.from(context),
            this,
        )
    }

    /**
     * @param text if text is empty or null, badgeText will hide. In other hands (even text == '0') badge will be shown.
     */
    fun setBadgeNum(text: CharSequence?) {
        if (text.isNullOrBlank()) {
            binding.tvBadge.visibility = View.GONE
        } else {
            binding.tvBadge.visibility = View.VISIBLE
            binding.tvBadge.text = text
        }
    }

    fun setBadgeBackground(drawable: Drawable) {
        binding.tvBadge.background = drawable
    }

    /**
     * @param color an int color like 0xFF0000 as RED
     */
    fun setBadgeBackgroundColor(color: Int) {
        binding.tvBadge.setBackgroundColor(color)
    }

    fun setBadgeBackgroundResource(@DrawableRes resId: Int) {
        binding.tvBadge.setBackgroundResource(resId)
    }

    fun setBadgeTextColor(colorStateList: ColorStateList) {
        binding.tvBadge.setTextColor(colorStateList)
    }

    /**
     * @param color an int color like 0xFF0000 as RED
     */
    fun setBadgeTextColor(color: Int) {
        binding.tvBadge.setTextColor(color)
    }

    fun setIcon(drawable: Drawable?) {
        binding.ivIcon.setImageDrawable(drawable)
    }

    fun setIcon(@DrawableRes resId: Int) {
        binding.ivIcon.setImageResource(resId)
    }

    fun setIcon(bitmap: Bitmap) {
        binding.ivIcon.setImageBitmap(bitmap)
    }

    fun setTypeFace(typeface: Typeface) {
        binding.tvBadge.typeface = typeface
    }

    fun setBadgeDrawableTint(@ColorInt color: Int) {
        DrawableCompat.setTint(
            binding
                .tvBadge
                .background,
            color
        )
    }

    //<editor-fold desc="deprecated methods">
    @Deprecated(level = DeprecationLevel.ERROR, message = "Use setIcon(Drawable?)", replaceWith = ReplaceWith("setIcon(drawable)"))
    fun setBadgeDrawable(drawable: Drawable?) {
        setIcon(drawable)
    }

    @Deprecated(level = DeprecationLevel.ERROR, message = "Use setIcon(@DrawableRes resId: Int)", replaceWith = ReplaceWith("setIcon(resId)"))
    fun setBadgeImageResource(@DrawableRes resId: Int) {
        setIcon(resId)
    }

    @Deprecated(level = DeprecationLevel.ERROR, message = "Use setIcon(bitmap: Bitmap)", replaceWith = ReplaceWith("setIcon(bitmap)"))
    fun setBadgeImageBitmap(bitmap: Bitmap) {
        setIcon(bitmap)
    }
    //</editor-fold>

    override fun setEnabled(enabled: Boolean) {
        super.setEnabled(enabled)
        val lvCount = childCount
        for (i in 0 until lvCount) {
            getChildAt(i).isEnabled = enabled
        }
    }
}
