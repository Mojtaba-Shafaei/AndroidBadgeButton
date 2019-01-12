
# AndroidToolbarBadgeButton
**A customizable square button to use as toolbar button with badge number.**



![sample AndroidToolbarBadgeButton image](https://github.com/Mojtaba-Shafaei/AndroidBadgeButton/blob/master/sampleImges/Screenshot_1.png)

## Methods

 `public void setBadgeNum(String text)`
Set Badge text. Its better to ellipse number greater than 99 to 99+
- `public void setBadgeBackgroundDrawable(Drawable drawable)`
- `public void setBadgeBackgroundColor(int color)`
- `public void setBadgeBackgroundResource(@DrawableRes int resId)`
- `public void setBadgeTextColor(ColorStateList colorStateList)`
- `public void setBadgeTextColor(int color)`
- `public void setEnabled(boolean enabled)`


## Xml attributes 

If you want to declare attributed in XML file, set below attrs as :
- `android:src` format: Drawable of button(Icon)
- `app:badgeBackground`  format: ColorStateList, Color, or Drawable
- `app:textColor` format: ColorStateList, Color
