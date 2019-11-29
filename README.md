# Deprecated
This library is deprecated

Please use this official one from Google instead


[https://material.io/develop/android/components/badging/](https://material.io/develop/android/components/badging/)

[https://material.io/develop/android/components/bottom-navigation-view/](https://material.io/develop/android/components/bottom-navigation-view/)

# BottomNavBadge

This is library that will help you add notification badges to your BottomNavigationView of com.android.support:design.

![bottomNavBadge](https://raw.githubusercontent.com/ammarptn/bottomNavBadge/master/src.png)

## Getting Started
Add it in your root build.gradle at the end of repositories:
```java
allprojects {
		repositories {
			...
			maven { url 'https://jitpack.io' }
		}
	}
```
Step 2. Add the dependency
```java
dependencies {

            implementation 'androidx.appcompat:appcompat:x.x.x'
            implementation 'com.google.android.material:material:x.x.x'
            ...
            implementation 'com.github.ammarptn:bottomNavBadge:1.0.3'
	}
```
### Usage
```java
.....
...

BottomNavigationView bottomNavMenu = findViewById(R.id.bottom_nav_menu);

// pass bottomNavMenu view and index of menu you want to show badge
Badge badge = NotificationBadge.getBadge(bottomNavMenu, 0); 

// set number to it
badge.setNumber(2); 

Badge badge1 = NotificationBadge.getBadge(bottomNavMenu, 1); 

// set number to it
badge1.setNumber(3); 

...
.....

```
![bottomNavBadge](https://raw.githubusercontent.com/ammarptn/bottomNavBadge/master/src2.png)
that all.


## Authors

* **Ammarptn** - *Initial work* - [Ammarptn](https://github.com/ammarptn)


## License

This project is licensed under the MIT License - see the [LICENSE.md](LICENSE.md) file for details

## Acknowledgments

* My free time, my cat , my life


