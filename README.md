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
	        implementation 'com.github.ammarptn:bottomNavBadge:1.0.0'
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

...
.....

```

that all.


## Authors

* **Ammarptn** - *Initial work* - [Ammarptn](https://github.com/ammarptn)


## License

This project is licensed under the MIT License - see the [LICENSE.md](LICENSE.md) file for details

## Acknowledgments

* My free time, my cat , my life


