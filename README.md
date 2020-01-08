
[![](https://jitpack.io/v/ShaoqiangPei/AndroidLibrary.svg)](https://jitpack.io/#ShaoqiangPei/AndroidLibrary)

### 库引用说明
在自己项目的project对应的build.gradle里面添加如下代码：
```
	allprojects {
		repositories {
			...
			maven { url 'https://jitpack.io' }
		}
	}
```
在你项目的app_module对应的build.gradle里面引用此库,如下：
```
  dependencies {
	        implementation 'com.github.ShaoqiangPei:AndroidLibrary:Tag'
	}
```
在app_module对应的build.gradle里面具体引用如下：
```
  dependencies {
	        implementation 'com.github.ShaoqiangPei:AndroidLibrary:1.1.0'
	}
```
在你的项目中自定义一个Application继承于ComContext,类似如下：
```
public class AppContext extends ComContext {

    @Override
    public void onCreate() {
        super.onCreate();

    }
}
```
在你项目的mainfast.xml中声明自己的application，类似如下：
```
 <application
        android:name=".AppContext"//声明自己的Application
	//以下省略
        //......
        >
    //此处省略
    //......

  </application>
```
### 使用说明
`库引用说明`记载的是最新版本的引用，若你使用的不是最新版本，请留意`迭代说明`上的迭代历程，以帮助你迅速接入你想使用的版本
本库引入你项目以后，若要了解各模块使用详细，请参见`使用说明索引`
- [使用说明索引](https://github.com/ShaoqiangPei/AndroidLibrary/blob/master/course/%E4%BD%BF%E7%94%A8%E8%AF%B4%E6%98%8E%E7%B4%A2%E5%BC%95.md)  
- [迭代说明](https://github.com/ShaoqiangPei/AndroidLibrary/blob/master/course/%E8%BF%AD%E4%BB%A3%E8%AF%B4%E6%98%8E.md)  











