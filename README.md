
# AndroidToolbarBadgeButton
**A customizable square button to use as toolbar button with badge number.**



![sample AndroidToolbarBadgeButton image](https://github.com/Mojtaba-Shafaei/AndroidBadgeButton/blob/master/sampleImges/Screenshot_1.png)

## Methods

- `public void setBadgeNum(String text)`
- `public void setBadgeBackgroundDrawable(Drawable drawable)`
- `public void setBadgeBackgroundColor(int color)`
- `public void setBadgeBackgroundResource(@DrawableRes int resId)`
- `public void setBadgeTextColor(ColorStateList colorStateList)`
- `public void setBadgeTextColor(int color)`
- `public void setEnabled(boolean enabled)`
- `public void setIcon(Drawable drawable)`
- `public void setIcon(@DrawableRes int idRes)`
- `public void setIcon(Bitmap bitmap)`


## Xml attributes 

|`android:src`   | Drawable of button(Icon)   |`public void setIcon(Drawable drawable)` |
| :------------ | :------------ | :------------ |
|`app:badgeBackground`   |  ColorStateList, Color, or Drawable  | `public void setBadgeBackgroundDrawable(Drawable drawable)`|
| `app:textColor`   |   ColorStateList, Color |`public void setBadgeTextColor(ColorStateList colorStateList)` |
