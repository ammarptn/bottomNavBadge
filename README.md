# Project Title

This is library that will help you add notification badges to your BottomNavigationView of com.android.support:design.

![alt text](https://raw.githubusercontent.com/ammarptn/bottomNavBadge/master/src.png)

## Getting Started

These instructions will get you a copy of the project up and running on your local machine for development and testing purposes. See deployment for notes on how to deploy the project on a live system.

### Usage
```
.....
...

bottomNavMenu = findViewById(R.id.bottom_nav_menu);

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

# bottomNavBadge
