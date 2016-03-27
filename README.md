# Android-BeeUI
Simple UI Builder.

Download from https://github.com/alex31n/Android-BeeUI/raw/master/libs/androidbeeui-1.0.aar

Now function are supported:
  - Random Colors
  - Button Background


---


### Random Color

```java

RandomColor randomColor = new RandomColor();
int color = randomColor.getRandomColor();
textview.setBackgroundColor(color);

```
![alt](https://github.com/alex31n/Android-BeeUI/raw/master/img_1.png)



### Drawable 
```java

int[] colors = randomColor.getRandomColor(2);
StateListDrawable d = DrawableBee.makeSelector(colors[0], colors[1]);
btn2.setBackground(d);

```

![alt](https://github.com/alex31n/Android-BeeUI/raw/master/img_2.png)



### Version
1.0.0

### Installation

1. Add a .aar file in libs folder.
2. Use "New Module" option under File menu.
3. Import the .aar file.
4. Build gradle and compile the project.


