package 日志框架和阶段项目06.电影购票系统02.run;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import 日志框架和阶段项目06.电影购票系统02.bean.Business;
import 日志框架和阶段项目06.电影购票系统02.bean.Customer;
import 日志框架和阶段项目06.电影购票系统02.bean.Movie;
import 日志框架和阶段项目06.电影购票系统02.bean.User;

import java.math.BigDecimal;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;
import java.util.concurrent.atomic.AtomicBoolean;

public class MovieSystem {
    /*
     定义系统的数据容器用户存储数据
     1、存储很多用户（客户对象，商家对象）
    */
    public static final List<User> ALL_USERS = new ArrayList<>();

    /*
     2、存储系统全部商家和其排片信息 。
     商家1 = [p1,p2,p3,...]
     商家2 = [p2,p3,...]
     ...
    */
    public static final Map<Business, List<Movie>> ALL_MOVIES = new HashMap<>();

    public static final Scanner SYS_SC = new Scanner(System.in);

    // 定义一个静态的User类型的变量记住当前登录成功的用户对象
    public static User loginUser;

    public static final Logger LOGGER = LoggerFactory.getLogger("MovieSystem.class");

    public static final SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH-mm-ss");

    /*
     定义一个静态的Map集合存储电影的评分
     */
    public static final Map<String, List<Double>> ALL_MOVIES_SCORE = new HashMap<>();


    /*
    利用静态代码块初识话静态类常量
     3、准备一些测试数据
    */
    static {
        Customer c = new Customer();
        c.setLoginName("zyf888");
        c.setPassWord("123456");
        c.setUserName("黑马刘德华");
        c.setSex('男');
        c.setMoney(10000);
        c.setPhone("110110");
        ALL_USERS.add(c);

        Customer c1 = new Customer();
        c1.setLoginName("gzl888");
        c1.setPassWord("123456");
        c1.setUserName("黑马关之琳");
        c1.setSex('女');
        c1.setMoney(2000);
        c1.setPhone("111111");
        ALL_USERS.add(c1);

        Business b = new Business();
        b.setLoginName("baozugong888");
        b.setPassWord("123456");
        b.setUserName("黑马包租公");
        b.setMoney(0);
        b.setSex('男');
        b.setPhone("110110");
        b.setAddress("火星6号2B二层");
        b.setShopName("甜甜圈国际影城");
        ALL_USERS.add(b);
        // 注意，商家一定需要加入到店铺排片信息中去
        List<Movie> movies = new ArrayList<>();
        ALL_MOVIES.put(b, movies); // b = []

        Business b2 = new Business();
        b2.setLoginName("baozupo888");
        b2.setPassWord("123456");
        b2.setUserName("黑马包租婆");
        b2.setMoney(0);
        b2.setSex('女');
        b2.setPhone("110110");
        b2.setAddress("火星8号8B八层");
        b2.setShopName("巧克力国际影城");
        ALL_USERS.add(b2);
        // 注意，商家一定需要加入到店铺排片信息中去
        List<Movie> movies3 = new ArrayList<>();
        ALL_MOVIES.put(b2, movies3); // b2 = []
    }

    public static void main(String[] args) {
        showMain();

    }

    private static void showMain() {
        while (true) {
            System.out.println("===============黑马电影首页=================");
            System.out.println("1、登录");
            System.out.println("2、用户注册");
            System.out.println("3、商家注册");
            System.out.println("请输入操作命令：");
            String commond = SYS_SC.nextLine();
            switch (commond) {
                case "1":
                    //登录
                    login();
                    break;
                case "2":
                    break;
                case "3":
                    break;
                default:
                    System.out.println("输入指令有误，请重新输入");
                    break;
            }
        }
    }

    private static void login() {
        while (true) {
            System.out.println("请输入登录名称：");
            String loginName = SYS_SC.nextLine();
            System.out.println("请输入登录密码：");
            String password = SYS_SC.nextLine();

            // 根据登录名称查询用户对象。
            User user = getUserByLoginName(loginName);
            if (user != null) {

                //判断用户密码
                if (user.getPassWord().equals(password)) {

                    // 登录成功
                    loginUser = user;
                    // 判断是用户登录的，还是商家登录的。
                    if (user instanceof Customer) {
                        //展示普通用户操作界面
                        showCustomerMain();
                    } else {
                        //展示商家操作界面
                        showBusinessMain();
                    }
                    return;

                } else {
                    System.out.println("密码错误，请重新输入！");
                }

            } else {
                System.out.println("登录名称错误，请重新输入！");
            }
        }

    }

    /*
    商家操作界面
     */
    private static void showBusinessMain() {
        while (true) {
            System.out.println("============黑马电影商家界面===================");
            System.out.println(loginUser.getUserName() + (loginUser.getSex() == '男' ? "先生" : "女士" + "欢迎您进入系统"));
            System.out.println("1、展示详情:");
            System.out.println("2、上架电影:");
            System.out.println("3、下架电影:");
            System.out.println("4、修改电影:");
            System.out.println("5、退出:");

            System.out.println("请输入您要操作的命令：");
            String command = SYS_SC.nextLine();
            switch (command) {
                case "1":
                    // 展示全部排片信息
                    showBusinessInfos();
                    break;
                case "2":
                    // 上架电影信息
                    addMovie();
                    break;
                case "3":
                    // 下架电影信息
                    deleteMovie();
                    break;
                case "4":
                    // 修改电影信息
                    updateMovie();
                    break;
                case "5":
                    System.out.println(loginUser.getUserName() + "请您下次再来啊~~~");
                    return; // 干掉方法
                default:
                    System.out.println("不存在该命令！！");
                    break;
            }
        }
    }

    private static void updateMovie() {
        System.out.println("================修改电影====================");
        List<Movie> movies = ALL_MOVIES.get(loginUser);

        if (movies.size() == 0) {
            System.out.println("排期中没有电影可以修改");
            return;
        }

        while (true) {
            System.out.println("请输入想要修改的影片名称：");
            String movieName = SYS_SC.nextLine();
            Movie movie = getMovieByName(movieName);
            if (movie != null) {
                System.out.println("请您输入新修改后片名：");
                String name = SYS_SC.nextLine();
                System.out.println("请您输入修改后主演：");
                String actor = SYS_SC.nextLine();
                System.out.println("请您输入修改后时长：");
                String time = SYS_SC.nextLine();
                System.out.println("请您输入修改后票价：");
                String price = SYS_SC.nextLine();
                System.out.println("请您输入修改后票数：");
                String totalNumber = SYS_SC.nextLine(); // 200\n
                while (true) {
                    try {
                        System.out.println("请您输入修改后影片放映时间：");
                        String stime = SYS_SC.nextLine();

                        // public Movie(String name, String actor, double time, double price, int number, Date startTime)
                        movie.setName(name);
                        movie.setActor(actor);
                        movie.setTime(Double.valueOf(time));
                        movie.setPrice(Double.valueOf(price));
                        movie.setNumber(Integer.valueOf(totalNumber));
                        movie.setStartTime(sdf.parse(stime));
                        System.out.println("修改成功！");
                        showAllMovies();
                        LOGGER.info(((Business) loginUser).getUserName() + "修改了排期中" + movie.getName() + "的信息");
                        return; // 直接退出去
                    } catch (ParseException e) {
                        e.printStackTrace();
                        LOGGER.error("时间解析出了毛病" + e);
                    }
                }
            } else {
                System.out.println("排期电影中没有查询到此片");
                System.out.println("是否继续修改（y/n）");
                String commond = SYS_SC.nextLine();
                switch (commond) {
                    case "y":
                        break;
                    case "n":
                        return;
                }
            }
        }

    }

    private static void deleteMovie() {
        List<Movie> movies = ALL_MOVIES.get(loginUser);

        if (movies.size() == 0) {
            System.out.println("排期中没有电影可以删除");
            return;
        }

        while (true) {
            System.out.println("请输入想要删除的影片名称：");
            String movieName = SYS_SC.nextLine();
            Movie movie = getMovieByName(movieName);
            if (movie != null) {
                movies.remove(movie);
                System.out.println("删除成功！");
                showAllMovies();
                LOGGER.info(((Business) loginUser).getUserName() + "删除了一部排期中的电影");
                return;
            } else {
                System.out.println("排期电影中没有查询到此片");
                System.out.println("是否继续删除（y/n）");
                String commond = SYS_SC.nextLine();
                switch (commond) {
                    case "y":
                        break;
                    case "n":
                        return;
                }
            }
        }

    }

    private static Movie getMovieByName(String movieName) {
        List<Movie> movies = ALL_MOVIES.get(loginUser);
        if (movies != null) {
            for (Movie movie : movies) {
                if (movie.getName().contains(movieName)) {
                    return movie;
                }
            }
            return null;
        } else {
            return null;
        }
    }

    private static void addMovie() {
        Business business = (Business) loginUser;
        System.out.println("================上架电影====================");
        LOGGER.info(business.getUserName() + "正在上架电影");

        // 根据商家对象(就是登录的用户loginUser)，作为Map集合的键 提取对应的值就是其排片信息 ：Map<Business , List<Movie>> ALL_MOVIES
        List<Movie> movies = ALL_MOVIES.get(business);
        System.out.println("请您输入新片名：");
        String name = SYS_SC.nextLine();
        System.out.println("请您输入主演：");
        String actor = SYS_SC.nextLine();
        System.out.println("请您输入时长：");
        String time = SYS_SC.nextLine();
        System.out.println("请您输入票价：");
        String price = SYS_SC.nextLine();
        System.out.println("请您输入票数：");
        String totalNumber = SYS_SC.nextLine(); // 200\n
        while (true) {
            try {
                System.out.println("请您输入影片放映时间：");
                String stime = SYS_SC.nextLine();
                // public Movie(String name, String actor, double time, double price, int number, Date startTime)        // 封装成电影对象 ，加入集合movices中去
                Movie movie = new Movie(name, actor, Double.valueOf(time), Double.valueOf(price)
                        , Integer.valueOf(totalNumber), sdf.parse(stime));
                movies.add(movie);
                System.out.println("您已经成功上架了：《" + movie.getName() + "》");
                return; // 直接退出去
            } catch (ParseException e) {
                e.printStackTrace();
                LOGGER.error("时间解析出了毛病" + e);
            }
        }

    }

    private static void showBusinessInfos() {
        Business business = (Business) loginUser;
        System.out.println("================商家店铺详情界面=================");
        LOGGER.info(business.getUserName() + "商家，正在看自己的详情~~~");
        System.out.println(business.getShopName() + "\t\t电话：" + business.getPhone()
                + "\t\t地址:" + business.getAddress() + "\t\t余额：" + business.getMoney());

        // 根据商家对象(就是登录的用户loginUser)，作为Map集合的键 提取对应的值就是其排片信息 ：Map<Business , List<Movie>> ALL_MOVIES
        List<Movie> movies = ALL_MOVIES.get(business);
        if (movies.size() > 0) {

            System.out.println("片名\t\t\t主演\t\t时长\t\t评分\t\t票价\t\t余票数量\t\t放映时间");
            for (Movie movie : movies) {
                System.out.println(movie.getName() + "\t\t\t" + movie.getActor() + "\t\t" + movie.getTime()
                        + "\t\t" + movie.getScore() + "\t\t" + movie.getPrice() + "\t\t" + movie.getNumber() + "\t\t"
                        + sdf.format(movie.getStartTime()));
            }

        } else {
            System.out.println("您的店铺当前无片在放映~~~~");
        }

    }

    /*
    客户操作界面
     */
    private static void showCustomerMain() {
        LOGGER.info("客户已登录~~");
        while (true) {
            System.out.println("============黑马电影客户界面===================");
            System.out.println(loginUser.getUserName() + (loginUser.getSex() == '男' ? "先生" : "女士" + "欢迎您进入系统" +
                    "\t余额：" + loginUser.getMoney()));
            System.out.println("请您选择要操作的功能：");
            System.out.println("1、展示全部影片信息功能:");
            System.out.println("2、根据电影名称查询电影信息:");
            System.out.println("3、评分功能:");
            System.out.println("4、购票功能:");
            System.out.println("5、退出系统:");
            System.out.println("请输入您要操作的命令：");
            String command = SYS_SC.nextLine();
            switch (command) {
                case "1":
                    // 展示全部排片信息
                    showAllMovies();
                    break;
                case "2":
                    break;
                case "3":
                    // 评分功能
                    scoreMovie();
                    showAllMovies();
                    break;
                case "4":
                    // 购票功能
                    buyMovie();
                    break;
                case "5":
                    return; // 干掉方法
                default:
                    System.out.println("不存在该命令！！");
                    break;
            }
        }

    }

    private static void buyMovie() {
        showAllMovies();
        while (true) {
            System.out.println("=============用户购票功能=================");
            System.out.println("请输入购买商家：");
            String shopName = SYS_SC.nextLine();

            //查询此商家
            Business business = getBusinessByShopName(shopName);
            if (business != null) {
                List<Movie> movies = ALL_MOVIES.get(business);
                if (movies.size() > 0) {
                    while (true) {
                        System.out.println("请输入购买电影名称");
                        String movieName = SYS_SC.nextLine();
                        Movie movie = getMovieByShopAndName(business, movieName);
                        if (movie != null) {
                            System.out.println("请输入想要购买的数量");
                            String number = SYS_SC.nextLine();
                            int buyNumber = Integer.valueOf(number);
                            if (buyNumber <= movie.getNumber()) {

                                double totalMoney = BigDecimal.valueOf(buyNumber).multiply(BigDecimal.valueOf(movie.getPrice())).doubleValue();
                                if (loginUser.getMoney() >= totalMoney) {
                                    loginUser.setMoney(loginUser.getMoney() - totalMoney);
                                    business.setMoney(business.getMoney() + totalMoney);
                                    movie.setNumber(movie.getNumber() - buyNumber);
                                    System.out.println("您成功购买了" + movie.getName() + buyNumber +
                                            "张票！总金额是：" + totalMoney);

                                    Customer customer = (Customer) loginUser;
                                    // 记录购买电影的信息
                                    // 第一个参数是购买的电影，第二个参数是没有评价的标记！
                                    customer.getBuyMovies().put(movie.getName(), false);

                                    return;
                                } else {
                                    System.out.println("钱不够");
                                    System.out.println("是否继续购买（y/n）");
                                    String commond = SYS_SC.nextLine();
                                    switch (commond) {
                                        case "y":
                                            break;
                                        case "n":
                                            return;
                                    }
                                }

                            } else {
                                System.out.println("此电影余票数量不够，还剩" + movie.getNumber() + "张");
                                System.out.println("是否继续购买（y/n）");
                                String commond = SYS_SC.nextLine();
                                switch (commond) {
                                    case "y":
                                        break;
                                    case "n":
                                        return;
                                }
                            }

                        } else {
                            System.out.println("此商家没有这个片子");
                        }
                    }


                } else {
                    System.out.println("此店铺关门了");
                    System.out.println("是否继续购买（y/n）");
                    String commond = SYS_SC.nextLine();
                    switch (commond) {
                        case "y":
                            break;
                        case "n":
                            return;
                    }
                }
            } else {
                System.out.println("没有此商家，请重新输入");
            }
        }
    }

    private static Movie getMovieByShopAndName(Business business, String movieName) {
        List<Movie> movies = ALL_MOVIES.get(business);
        for (Movie movie : movies) {
            if (movie.getName().contains(movieName)) {
                return movie;
            }
        }
        return null;
    }

    private static Business getBusinessByShopName(String shopName) {
        Set<Business> businesses = ALL_MOVIES.keySet();
        for (Business business : businesses) {
            if (business.getShopName().equals(shopName)) {
                List<Movie> movies = ALL_MOVIES.get(business);
                return business;
            }
        }
        return null;
    }

    private static void scoreMovie() {
        Customer customer = (Customer) loginUser;
        Map<String, Boolean> buyMovies = customer.getBuyMovies();
        Set<String> buy = buyMovies.keySet();

        if (buyMovies.size() == 0) {
            System.out.println("没有购买观看过电影，无法评价");
            return;
        }

        while (true) {
            AtomicBoolean flag = new AtomicBoolean(false);
            System.out.println("==============电影评价=============");
            System.out.println("您已购买观看的电影如下：");
            buyMovies.forEach((s, b) -> System.out.println(s + "是否评价->" + b));

            System.out.println("请输入想要评价的电影：");
            String wantJudjeMovie = SYS_SC.nextLine();

            for (String s : buy) {
                if (s.equals(wantJudjeMovie)) {
                    if (buyMovies.get(wantJudjeMovie) == false) {
                        System.out.println("请输入评分（0-10）");
                        Double score = Double.valueOf(SYS_SC.nextLine());

                        //获取评分数据
                        List<Double> scories = ALL_MOVIES_SCORE.get(wantJudjeMovie);
                        if (scories != null) {
                            scories.add(score);
                        } else {
                            scories = new ArrayList<>();
                            scories.add(score);
                            ALL_MOVIES_SCORE.put(wantJudjeMovie, scories);
                        }
                        System.out.println("评价成功！");
                        buyMovies.put(wantJudjeMovie, true);
                        return;
                    } else {
                        System.out.println("此电影已评价！");
                        flag.set(true);
                    }
                }
            }

            if (flag.get() == false) {
                System.out.println("没有购买观看此电影");
                System.out.println("是否继续评价（y/n）");
                String commond = SYS_SC.nextLine();
                switch (commond) {
                    case "y":
                        break;
                    case "n":
                        return;
                }
            }


        }
    }

    private static void showAllMovies() {
        Set<Business> businesses = ALL_MOVIES.keySet();
        for (Business business : businesses) {
            System.out.println(business.getShopName() + "\t\t电话：" + business.getPhone()
                    + "\t\t地址:" + business.getAddress() + "\t\t余额：" + business.getMoney());

            List<Movie> movies = ALL_MOVIES.get(business);
            System.out.println("\t\t\t片名\t\t\t主演\t\t时长\t\t评分\t\t票价\t\t余票数量\t\t放映时间");
            for (Movie movie : movies) {
                System.out.println("\t\t\t" + movie.getName() + "\t\t\t" + movie.getActor() + "\t\t" + movie.getTime()
                        + "\t\t" + movie.getScore() + "\t\t" + movie.getPrice() + "\t\t" + movie.getNumber() + "\t\t"
                        + sdf.format(movie.getStartTime()));
            }

        }
    }


    private static User getUserByLoginName(String loginName) {
        for (User user : ALL_USERS) {
            if (user.getLoginName().equals(loginName)) {
                return user;
            }
        }
        return null;
    }
}
