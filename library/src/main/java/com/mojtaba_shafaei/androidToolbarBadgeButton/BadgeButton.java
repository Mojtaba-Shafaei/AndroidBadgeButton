package com.mojtaba_shafaei.androidToolbarBadgeButton;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.support.annotation.DrawableRes;
import android.support.constraint.ConstraintLayout;
import android.support.v4.content.ContextCompat;
import android.support.v7.widget.AppCompatImageView;
import android.support.v7.widget.AppCompatTextView;
import android.util.AttributeSet;
import android.view.ViewGroup;
import com.mojtaba_shafaei.android.androidToolbarBadgeButton.R;

public class BadgeButton extends ConstraintLayout {

private ViewGroup root;
private AppCompatImageView ivIcon;
private AppCompatTextView tvBadge;

public BadgeButton(Context context) {
super(context);
init(context);
}

public BadgeButton(Context context, AttributeSet attrs) {
super(context, attrs);
init(context);
readAttrs(context, attrs);
}

public BadgeButton(Context context, AttributeSet attrs, int defStyleAttr) {
super(context, attrs, defStyleAttr);
init(context);
readAttrs(context, attrs);
}

private void readAttrs(Context context, AttributeSet attrs) {
TypedArray a = context.getTheme().obtainStyledAttributes(
  attrs,
  R.styleable.BadgeButton,
  0, 0);

try {
int bg = a.getResourceId(R.styleable.BadgeButton_badgeBackground, 0);
if (bg != 0) {
tvBadge.setBackgroundResource(bg);
}

if (a.hasValue(R.styleable.BadgeButton_android_src)) {
Drawable icon = a.getDrawable(R.styleable.BadgeButton_android_src);
ivIcon.setImageDrawable(icon);
}

if (a.hasValue(R.styleable.BadgeButton_textColor)) {
int textColor = a.getResourceId(R.styleable.BadgeButton_textColor, 0);
tvBadge.setTextColor(ContextCompat.getColorStateList(context, textColor));
}

} finally {
a.recycle();
}
}

private void init(Context context) {
inflate(context, R.layout.layout, this);

root = findViewById(R.id.badgeButtonRoot);
ivIcon = findViewById(R.id.iv_icon);
tvBadge = findViewById(R.id.tv_badge);
}

/**
 * @param text if text is empty or null, badgeText will hide. In other hands (even text == '0') badge will be shown.
 */
public void setBadgeNum(String text) {
if (text == null || text.isEmpty()) {
tvBadge.setVisibility(GONE);
} else {
tvBadge.setVisibility(VISIBLE);
tvBadge.setText(text);
}
}

public void setBadgeBackgroundDrawable(Drawable drawable) {
tvBadge.setBackgroundDrawable(drawable);
}

/**
 * @param color an int color like 0xFF0000 as RED
 */
public void setBadgeBackgroundColor(int color) {
tvBadge.setBackgroundColor(color);
}

public void setBadgeBackgroundResource(@DrawableRes int resId) {
tvBadge.setBackgroundResource(resId);
}

public void setBadgeTextColor(ColorStateList colorStateList) {
tvBadge.setTextColor(colorStateList);
}

/**
 * @param color an int color like 0xFF0000 as RED
 */
public void setBadgeTextColor(int color) {
tvBadge.setTextColor(color);
}


public void setBadgeDrawable(Drawable drawable) {
ivIcon.setImageDrawable(drawable);
}

public void setBadgeImageResource(@DrawableRes int idRes) {
ivIcon.setImageResource(idRes);
}

public void setBadgeImageBitmap(Bitmap bitmap) {
ivIcon.setImageBitmap(bitmap);
}

@Override
public void setEnabled(boolean enabled) {
super.setEnabled(enabled);
final int lvCount = root.getChildCount();
for (int i = 0; i < lvCount; i++) {
root.getChildAt(i).setEnabled(enabled);
}
}


}
