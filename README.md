
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
- `fun setTypeFace(typeface: Typeface)`


## Xml attributes 

|`app:icon`   | Drawable of button(Icon)   |`public void setIcon(Drawable drawable)` |
| :------------ | :------------ | :------------ |
|`app:badgeBackground`   |  ColorStateList, Color, or Drawable  | `public void setBadgeBackgroundDrawable(Drawable drawable)`|
|`app:textColor`   |   ColorStateList, Color |`public void setBadgeTextColor(ColorStateList colorStateList)` |


## Installation
```groovy
allprojects {
		repositories {
		
			maven { url 'https://jitpack.io' }
		}
	}
```

```groovy
dependencies {
    implementation 'com.github.mojtaba-shafaei:androidbadgebutton:last-version'
}
```
[![Android Arsenal]( https://img.shields.io/badge/Android%20Arsenal-AndroidBadgeButton-green.svg?style=flat )]( https://android-arsenal.com/details/1/7449 )

[![](https://jitpack.io/v/mojtaba-shafaei/androidbadgebutton.svg)](https://jitpack.io/#mojtaba-shafaei/androidbadgebutton)

