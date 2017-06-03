##### authors: 胡志勇、司鑫

#### 游戏说明
##### 一、操作指南

**1、运行 `Game.java`  中的 `main` 方法**

**2、根据控制台的提示进行输入操作即可**

**3、关闭游戏请先最小化,再关掉main**
##### 二、模式说明

- 默认模式：用户只需要选择动画切换时间（毫秒）即可
- 自定义模式：用户需要输入游戏矩阵的大小，以及细胞活着的坐标和动画切换的时间

##### 三、常量说明

 - public static int INTERVAL_TIME = 1000; //默认的动画切换时间
 - public static String PANEL_TITLE = "GAME"; //默认的窗口名
 - public static int CHESS_SIZE = 8; //默认的细胞大小
 - public static int INIT_LOCATION_POINT = 8;//默认距离顶点坐标的位置（x，y）
 - public static int INCREMENT_DISTANCE = 8;//细胞之间的间隔
 - public static int ALIVE_NUMBER = 3;//存活的情况下周围的细胞数量
 - public static int NO_CHANGE_NUMBER = 2;//当前细胞状态不变的情况下周围的细胞数量
 
 - public static String INIT_POINTS = ""; //默认的细胞坐标点集
 - public static String INIT_SIZE = "";//默认的矩阵大小

