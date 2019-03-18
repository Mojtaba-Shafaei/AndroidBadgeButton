package com.mojtaba_shafaei.androidToolbarBadgeButton

import android.content.Context
import android.content.res.ColorStateList
import android.graphics.Bitmap
import android.graphics.drawable.Drawable
import android.util.AttributeSet
import android.view.LayoutInflater
import android.view.View
import android.widget.FrameLayout
import androidx.annotation.DrawableRes
import androidx.core.content.ContextCompat
import com.mojtaba_shafaei.android.androidToolbarBadgeButton.R
import kotlinx.android.synthetic.main.badge_button_layout.view.*

class BadgeButton : FrameLayout {

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
        tv_badge.setBackgroundResource(bg)
      }

      if (a.hasValue(R.styleable.BadgeButton_icon)) {
        val icon = a.getResourceId(R.styleable.BadgeButton_icon, 0)
        if (icon != 0)
          iv_icon.setImageResource(icon)
      }

      if (a.hasValue(R.styleable.BadgeButton_textColor)) {
        val textColor = a.getResourceId(R.styleable.BadgeButton_textColor, 0)
        tv_badge.setTextColor(ContextCompat.getColorStateList(context, textColor))
      }

    } finally {
      a.recycle()
    }
  }

  private fun init(context: Context) {
    LayoutInflater.from(context).inflate(R.layout.badge_button_layout, this, true)
  }

  /**
   * @param text if text is empty or null, badgeText will hide. In other hands (even text == '0') badge will be shown.
   */
  fun setBadgeNum(text: String?) {
    if (text == null || text.isEmpty()) {
      tv_badge.visibility = View.GONE
    } else {
      tv_badge.visibility = View.VISIBLE
      tv_badge.text = text
    }
  }

  fun setBadgeBackground(drawable: Drawable) {
    tv_badge.background = drawable
  }

  /**
   * @param color an int color like 0xFF0000 as RED
   */
  fun setBadgeBackgroundColor(color: Int) {
    tv_badge.setBackgroundColor(color)
  }

  fun setBadgeBackgroundResource(@DrawableRes resId: Int) {
    tv_badge.setBackgroundResource(resId)
  }

  fun setBadgeTextColor(colorStateList: ColorStateList) {
    tv_badge.setTextColor(colorStateList)
  }

  /**
   * @param color an int color like 0xFF0000 as RED
   */
  fun setBadgeTextColor(color: Int) {
    tv_badge.setTextColor(color)
  }

  fun setIcon(drawable: Drawable?) {
    iv_icon.setImageDrawable(drawable)
  }

  fun setIcon(@DrawableRes resId: Int) {
    iv_icon.setImageResource(resId)
  }

  fun setIcon(bitmap: Bitmap) {
    iv_icon.setImageBitmap(bitmap)
  }

  //<editor-fold desc="deprecated methods">
  @Deprecated(level = DeprecationLevel.ERROR
    , message = "Use setIcon(Drawable?)"
    , replaceWith = ReplaceWith("setIcon(drawable)"))
  fun setBadgeDrawable(drawable: Drawable?) {
    setIcon(drawable)
  }

  @Deprecated(level = DeprecationLevel.ERROR
    , message = "Use setIcon(@DrawableRes resId: Int)"
    , replaceWith = ReplaceWith("setIcon(resId)"))
  fun setBadgeImageResource(@DrawableRes resId: Int) {
    setIcon(resId)
  }

  @Deprecated(level = DeprecationLevel.ERROR
    , message = "Use setIcon(bitmap: Bitmap)"
    , replaceWith = ReplaceWith("setIcon(bitmap)"))
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
