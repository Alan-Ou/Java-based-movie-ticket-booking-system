package com.app.movie.bean

/**
 *    author : yi.huangxing
 *    date   : 2021/3/15/0015  12:41
 *    desc   :
 */
data class HotResBean(
    val chiefBonus: ChiefBonus,
    val coming: MutableList<Any>,
    val movieIds: MutableList<Int>,
    val movieList: MutableList<Movie>,
    val stid: String,
    val stids: MutableList<Stid>,
    val total: Int
)

class ChiefBonus(
)

data class Movie(
    val globalReleased: Boolean,
    val haspromotionTag: Boolean,
    val id: Int,
    val img: String,
    val nm: String,
    val preShow: Boolean,
    val rt: String,
    val sc: Double,
    val showInfo: String,
    val showst: Int,
    val star: String,
    val version: String,
    val wish: Int,
    val wishst: Int
)

data class Stid(
    val movieId: Int,
    val stid: String
)

const val  json="{\n" +
        "\t\"chiefBonus\": {},\n" +
        "\t\"coming\": [],\n" +
        "\t\"movieIds\": [\n" +
        "\t\t243,\n" +
        "\t\t1299372,\n" +
        "\t\t1300936,\n" +
        "\t\t894008,\n" +
        "\t\t1212538,\n" +
        "\t\t1048268,\n" +
        "\t\t1217023,\n" +
        "\t\t1219636,\n" +
        "\t\t1299124,\n" +
        "\t\t1225754,\n" +
        "\t\t1263157,\n" +
        "\t\t1309692,\n" +
        "\t\t1310470,\n" +
        "\t\t1298938,\n" +
        "\t\t1240803,\n" +
        "\t\t1218437,\n" +
        "\t\t1298359,\n" +
        "\t\t553231,\n" +
        "\t\t1301774,\n" +
        "\t\t1199007,\n" +
        "\t\t1229373,\n" +
        "\t\t1199934,\n" +
        "\t\t1301793,\n" +
        "\t\t1280137,\n" +
        "\t\t111544,\n" +
        "\t\t1245589,\n" +
        "\t\t1281464,\n" +
        "\t\t1336148,\n" +
        "\t\t1327499,\n" +
        "\t\t1351661,\n" +
        "\t\t248906,\n" +
        "\t\t1207337,\n" +
        "\t\t1265157,\n" +
        "\t\t345409,\n" +
        "\t\t3906,\n" +
        "\t\t274221,\n" +
        "\t\t275493,\n" +
        "\t\t7015,\n" +
        "\t\t2528,\n" +
        "\t\t1227323,\n" +
        "\t\t1367433,\n" +
        "\t\t1358557\n" +
        "\t],\n" +
        "\t\"stid\": \"576591972453269000\",\n" +
        "\t\"stids\": [\n" +
        "\t\t{\n" +
        "\t\t\t\"movieId\": 243,\n" +
        "\t\t\t\"stid\": \"576591972453269000_a243_c0\"\n" +
        "\t\t},\n" +
        "\t\t{\n" +
        "\t\t\t\"movieId\": 1299372,\n" +
        "\t\t\t\"stid\": \"576591972453269000_a1299372_c1\"\n" +
        "\t\t},\n" +
        "\t\t{\n" +
        "\t\t\t\"movieId\": 1300936,\n" +
        "\t\t\t\"stid\": \"576591972453269000_a1300936_c2\"\n" +
        "\t\t},\n" +
        "\t\t{\n" +
        "\t\t\t\"movieId\": 894008,\n" +
        "\t\t\t\"stid\": \"576591972453269000_a894008_c3\"\n" +
        "\t\t},\n" +
        "\t\t{\n" +
        "\t\t\t\"movieId\": 1212538,\n" +
        "\t\t\t\"stid\": \"576591972453269000_a1212538_c4\"\n" +
        "\t\t},\n" +
        "\t\t{\n" +
        "\t\t\t\"movieId\": 1048268,\n" +
        "\t\t\t\"stid\": \"576591972453269000_a1048268_c5\"\n" +
        "\t\t},\n" +
        "\t\t{\n" +
        "\t\t\t\"movieId\": 1217023,\n" +
        "\t\t\t\"stid\": \"576591972453269000_a1217023_c6\"\n" +
        "\t\t},\n" +
        "\t\t{\n" +
        "\t\t\t\"movieId\": 1219636,\n" +
        "\t\t\t\"stid\": \"576591972453269000_a1219636_c7\"\n" +
        "\t\t},\n" +
        "\t\t{\n" +
        "\t\t\t\"movieId\": 1299124,\n" +
        "\t\t\t\"stid\": \"576591972453269000_a1299124_c8\"\n" +
        "\t\t},\n" +
        "\t\t{\n" +
        "\t\t\t\"movieId\": 1225754,\n" +
        "\t\t\t\"stid\": \"576591972453269000_a1225754_c9\"\n" +
        "\t\t},\n" +
        "\t\t{\n" +
        "\t\t\t\"movieId\": 1263157,\n" +
        "\t\t\t\"stid\": \"576591972453269000_a1263157_c10\"\n" +
        "\t\t},\n" +
        "\t\t{\n" +
        "\t\t\t\"movieId\": 1309692,\n" +
        "\t\t\t\"stid\": \"576591972453269000_a1309692_c11\"\n" +
        "\t\t}\n" +
        "\t],\n" +
        "\t\"total\": 42,\n" +
        "\t\"movieList\": [\n" +
        "\t\t{\n" +
        "\t\t\t\"id\": 243,\n" +
        "\t\t\t\"haspromotionTag\": false,\n" +
        "\t\t\t\"img\": \"http://p0.meituan.net/w.h/moviemachine/1e2602397412b216027448e5351a06fd464780.jpg\",\n" +
        "\t\t\t\"version\": \"v3d imax\",\n" +
        "\t\t\t\"nm\": \"阿凡达\",\n" +
        "\t\t\t\"preShow\": false,\n" +
        "\t\t\t\"sc\": 9.3,\n" +
        "\t\t\t\"globalReleased\": true,\n" +
        "\t\t\t\"wish\": 35621,\n" +
        "\t\t\t\"star\": \"萨姆·沃辛顿,佐伊·索尔达娜,米歇尔·罗德里格兹\",\n" +
        "\t\t\t\"rt\": \"2021-03-12\",\n" +
        "\t\t\t\"showInfo\": \"今天323家影院放映2805场\",\n" +
        "\t\t\t\"showst\": 3,\n" +
        "\t\t\t\"wishst\": 0\n" +
        "\t\t},\n" +
        "\t\t{\n" +
        "\t\t\t\"id\": 1299372,\n" +
        "\t\t\t\"haspromotionTag\": false,\n" +
        "\t\t\t\"img\": \"http://p0.meituan.net/w.h/movie/48774506dc0e68805bc25d2cd087d1024316392.jpg\",\n" +
        "\t\t\t\"version\": \"\",\n" +
        "\t\t\t\"nm\": \"你好，李焕英\",\n" +
        "\t\t\t\"preShow\": false,\n" +
        "\t\t\t\"sc\": 9.5,\n" +
        "\t\t\t\"globalReleased\": true,\n" +
        "\t\t\t\"wish\": 1162302,\n" +
        "\t\t\t\"star\": \"贾玲,张小斐,沈腾\",\n" +
        "\t\t\t\"rt\": \"2021-02-12\",\n" +
        "\t\t\t\"showInfo\": \"今天321家影院放映2058场\",\n" +
        "\t\t\t\"showst\": 3,\n" +
        "\t\t\t\"wishst\": 0\n" +
        "\t\t},\n" +
        "\t\t{\n" +
        "\t\t\t\"id\": 1300936,\n" +
        "\t\t\t\"haspromotionTag\": false,\n" +
        "\t\t\t\"img\": \"http://p0.meituan.net/w.h/movie/8a1ad4ec0d81f240e4d8c2d1b10c2ec53475644.jpg\",\n" +
        "\t\t\t\"version\": \"\",\n" +
        "\t\t\t\"nm\": \"人潮汹涌\",\n" +
        "\t\t\t\"preShow\": false,\n" +
        "\t\t\t\"sc\": 9.1,\n" +
        "\t\t\t\"globalReleased\": true,\n" +
        "\t\t\t\"wish\": 246956,\n" +
        "\t\t\t\"star\": \"刘德华,肖央,万茜\",\n" +
        "\t\t\t\"rt\": \"2021-02-12\",\n" +
        "\t\t\t\"showInfo\": \"今天309家影院放映1441场\",\n" +
        "\t\t\t\"showst\": 3,\n" +
        "\t\t\t\"wishst\": 0\n" +
        "\t\t},\n" +
        "\t\t{\n" +
        "\t\t\t\"id\": 894008,\n" +
        "\t\t\t\"haspromotionTag\": false,\n" +
        "\t\t\t\"img\": \"http://p1.meituan.net/w.h/moviemachine/9be184648a639e0976887c9fd63385b36499634.jpg\",\n" +
        "\t\t\t\"version\": \"v3d imax\",\n" +
        "\t\t\t\"nm\": \"寻龙传说\",\n" +
        "\t\t\t\"preShow\": false,\n" +
        "\t\t\t\"sc\": 9.1,\n" +
        "\t\t\t\"globalReleased\": true,\n" +
        "\t\t\t\"wish\": 30832,\n" +
        "\t\t\t\"star\": \"赵丽颖,凯莉·玛丽·陈,奥卡菲娜\",\n" +
        "\t\t\t\"rt\": \"2021-03-05\",\n" +
        "\t\t\t\"showInfo\": \"今天300家影院放映1090场\",\n" +
        "\t\t\t\"showst\": 3,\n" +
        "\t\t\t\"wishst\": 0\n" +
        "\t\t},\n" +
        "\t\t{\n" +
        "\t\t\t\"id\": 1212538,\n" +
        "\t\t\t\"haspromotionTag\": false,\n" +
        "\t\t\t\"img\": \"http://p1.meituan.net/w.h/movie/b7383bb5a78d70f0a1ef35b4b0f295f43266884.jpg\",\n" +
        "\t\t\t\"version\": \"\",\n" +
        "\t\t\t\"nm\": \"合法伴侣\",\n" +
        "\t\t\t\"preShow\": false,\n" +
        "\t\t\t\"sc\": 7,\n" +
        "\t\t\t\"globalReleased\": true,\n" +
        "\t\t\t\"wish\": 42431,\n" +
        "\t\t\t\"star\": \"李治廷,张榕容,白客\",\n" +
        "\t\t\t\"rt\": \"2021-03-12\",\n" +
        "\t\t\t\"showInfo\": \"今天251家影院放映576场\",\n" +
        "\t\t\t\"showst\": 3,\n" +
        "\t\t\t\"wishst\": 0\n" +
        "\t\t},\n" +
        "\t\t{\n" +
        "\t\t\t\"id\": 1048268,\n" +
        "\t\t\t\"haspromotionTag\": false,\n" +
        "\t\t\t\"img\": \"http://p0.meituan.net/w.h/movie/9ef2f7d8d6f11c55723d7be5fa77218d1022103.jpg\",\n" +
        "\t\t\t\"version\": \"v3d imax\",\n" +
        "\t\t\t\"nm\": \"刺杀小说家\",\n" +
        "\t\t\t\"preShow\": false,\n" +
        "\t\t\t\"sc\": 8.6,\n" +
        "\t\t\t\"globalReleased\": true,\n" +
        "\t\t\t\"wish\": 500948,\n" +
        "\t\t\t\"star\": \"雷佳音,杨幂,董子健\",\n" +
        "\t\t\t\"rt\": \"2021-02-12\",\n" +
        "\t\t\t\"showInfo\": \"今天252家影院放映640场\",\n" +
        "\t\t\t\"showst\": 3,\n" +
        "\t\t\t\"wishst\": 0\n" +
        "\t\t},\n" +
        "\t\t{\n" +
        "\t\t\t\"id\": 1217023,\n" +
        "\t\t\t\"haspromotionTag\": false,\n" +
        "\t\t\t\"img\": \"http://p1.meituan.net/w.h/movie/ece9ff81e6f0af2c859aa151e42a33312706648.jpg\",\n" +
        "\t\t\t\"version\": \"v2d imax\",\n" +
        "\t\t\t\"nm\": \"唐人街探案3\",\n" +
        "\t\t\t\"preShow\": false,\n" +
        "\t\t\t\"sc\": 8.8,\n" +
        "\t\t\t\"globalReleased\": true,\n" +
        "\t\t\t\"wish\": 4468547,\n" +
        "\t\t\t\"star\": \"王宝强,刘昊然,妻夫木聪\",\n" +
        "\t\t\t\"rt\": \"2021-02-12\",\n" +
        "\t\t\t\"showInfo\": \"今天267家影院放映644场\",\n" +
        "\t\t\t\"showst\": 3,\n" +
        "\t\t\t\"wishst\": 0\n" +
        "\t\t},\n" +
        "\t\t{\n" +
        "\t\t\t\"id\": 1219636,\n" +
        "\t\t\t\"haspromotionTag\": false,\n" +
        "\t\t\t\"img\": \"http://p0.meituan.net/w.h/movie/eaea6a447b20366f682203c6710d0ff22149802.jpg\",\n" +
        "\t\t\t\"version\": \"\",\n" +
        "\t\t\t\"nm\": \"五尺天涯\",\n" +
        "\t\t\t\"preShow\": false,\n" +
        "\t\t\t\"sc\": 8.9,\n" +
        "\t\t\t\"globalReleased\": true,\n" +
        "\t\t\t\"wish\": 32987,\n" +
        "\t\t\t\"star\": \"海莉·露·理查森,科尔·斯普罗斯,莫伊塞斯·阿里亚斯\",\n" +
        "\t\t\t\"rt\": \"2021-03-12\",\n" +
        "\t\t\t\"showInfo\": \"今天174家影院放映367场\",\n" +
        "\t\t\t\"showst\": 3,\n" +
        "\t\t\t\"wishst\": 0\n" +
        "\t\t},\n" +
        "\t\t{\n" +
        "\t\t\t\"id\": 1299124,\n" +
        "\t\t\t\"haspromotionTag\": false,\n" +
        "\t\t\t\"img\": \"http://p0.meituan.net/w.h/moviemachine/6766681dc599e1964e9acbf86391207377187.jpg\",\n" +
        "\t\t\t\"version\": \"v3d imax\",\n" +
        "\t\t\t\"nm\": \"新神榜：哪吒重生\",\n" +
        "\t\t\t\"preShow\": false,\n" +
        "\t\t\t\"sc\": 8.7,\n" +
        "\t\t\t\"globalReleased\": true,\n" +
        "\t\t\t\"wish\": 266547,\n" +
        "\t\t\t\"star\": \"杨天翔,张赫,宣晓鸣\",\n" +
        "\t\t\t\"rt\": \"2021-02-12\",\n" +
        "\t\t\t\"showInfo\": \"今天115家影院放映188场\",\n" +
        "\t\t\t\"showst\": 3,\n" +
        "\t\t\t\"wishst\": 0\n" +
        "\t\t},\n" +
        "\t\t{\n" +
        "\t\t\t\"id\": 1225754,\n" +
        "\t\t\t\"haspromotionTag\": false,\n" +
        "\t\t\t\"img\": \"http://p0.meituan.net/w.h/moviemachine/778ef027d0fe90fd27448d8369d4cf9e2820477.jpg\",\n" +
        "\t\t\t\"version\": \"\",\n" +
        "\t\t\t\"nm\": \"猫和老鼠\",\n" +
        "\t\t\t\"preShow\": false,\n" +
        "\t\t\t\"sc\": 7.9,\n" +
        "\t\t\t\"globalReleased\": true,\n" +
        "\t\t\t\"wish\": 298926,\n" +
        "\t\t\t\"star\": \"科洛·格蕾斯·莫瑞兹,迈克尔·佩纳,郑肯\",\n" +
        "\t\t\t\"rt\": \"2021-02-26\",\n" +
        "\t\t\t\"showInfo\": \"今天117家影院放映169场\",\n" +
        "\t\t\t\"showst\": 3,\n" +
        "\t\t\t\"wishst\": 0\n" +
        "\t\t},\n" +
        "\t\t{\n" +
        "\t\t\t\"id\": 1263157,\n" +
        "\t\t\t\"haspromotionTag\": false,\n" +
        "\t\t\t\"img\": \"http://p0.meituan.net/w.h/movie/d327b90218f2fcd67e31d50a977f4ffe2955416.jpg\",\n" +
        "\t\t\t\"version\": \"\",\n" +
        "\t\t\t\"nm\": \"波斯语课\",\n" +
        "\t\t\t\"preShow\": false,\n" +
        "\t\t\t\"sc\": 0,\n" +
        "\t\t\t\"globalReleased\": false,\n" +
        "\t\t\t\"wish\": 7024,\n" +
        "\t\t\t\"star\": \"纳威尔·佩雷兹·毕斯卡亚特,拉斯·艾丁格,尼克·迈瑞莱格伦\",\n" +
        "\t\t\t\"rt\": \"2021-03-19\",\n" +
        "\t\t\t\"showInfo\": \"2021-03-19 本周五上映\",\n" +
        "\t\t\t\"showst\": 4,\n" +
        "\t\t\t\"wishst\": 0\n" +
        "\t\t},\n" +
        "\t\t{\n" +
        "\t\t\t\"id\": 1309692,\n" +
        "\t\t\t\"haspromotionTag\": false,\n" +
        "\t\t\t\"img\": \"http://p1.meituan.net/w.h/moviemachine/32f40a66d85c24bee19c57d86773520e14797735.jpg\",\n" +
        "\t\t\t\"version\": \"\",\n" +
        "\t\t\t\"nm\": \"千顷澄碧的时代\",\n" +
        "\t\t\t\"preShow\": false,\n" +
        "\t\t\t\"sc\": 0,\n" +
        "\t\t\t\"globalReleased\": true,\n" +
        "\t\t\t\"wish\": 1967,\n" +
        "\t\t\t\"star\": \"李东学,宋佳伦,苏丽\",\n" +
        "\t\t\t\"rt\": \"2021-02-26\",\n" +
        "\t\t\t\"showInfo\": \"今天10家影院放映13场\",\n" +
        "\t\t\t\"showst\": 3,\n" +
        "\t\t\t\"wishst\": 0\n" +
        "\t\t}\n" +
        "\t]\n" +
        "}"