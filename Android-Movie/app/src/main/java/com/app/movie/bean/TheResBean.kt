package com.app.movie.bean

/**
 *    author : yi.huangxing
 *    date   : 2021/3/15/0015  14:36
 *    desc   :
 */
data class TheResBean(
    val coming: MutableList<Coming>,
    val movieIds: List<Int>
)

data class Coming(
    val comingTitle: String,
    val globalReleased: Boolean,
    val haspromotionTag: Boolean,
    val id: Int,
    val img: String,
    val nm: String,
    val preShow: Boolean,
    val rt: String,
    val sc: Int,
    val showInfo: String,
    val showst: Int,
    val star: String,
    val version: String,
    val wish: Int,
    val wishst: Int
)



const val jsonObject="{\n" +
        "\t\"coming\": [\n" +
        "\t\t{\n" +
        "\t\t\t\"id\": 1372081,\n" +
        "\t\t\t\"haspromotionTag\": false,\n" +
        "\t\t\t\"img\": \"http://p0.meituan.net/w.h/movie/30f321cb0cc71f60e4e86c3730497a32437305.jpg\",\n" +
        "\t\t\t\"version\": \"\",\n" +
        "\t\t\t\"nm\": \"岁月江城\",\n" +
        "\t\t\t\"preShow\": false,\n" +
        "\t\t\t\"sc\": 0,\n" +
        "\t\t\t\"globalReleased\": false,\n" +
        "\t\t\t\"wish\": 598,\n" +
        "\t\t\t\"star\": \"张竞达,李月,曾凡博\",\n" +
        "\t\t\t\"rt\": \"2021-03-18\",\n" +
        "\t\t\t\"showst\": 1,\n" +
        "\t\t\t\"wishst\": 0,\n" +
        "\t\t\t\"comingTitle\": \"3月18日 周四\"\n" +
        "\t\t},\n" +
        "\t\t{\n" +
        "\t\t\t\"id\": 1218437,\n" +
        "\t\t\t\"haspromotionTag\": false,\n" +
        "\t\t\t\"img\": \"http://p0.meituan.net/w.h/movie/8de713ce22b34faf8d033f1aa62918dc857749.jpg\",\n" +
        "\t\t\t\"version\": \"\",\n" +
        "\t\t\t\"nm\": \"日不落酒店\",\n" +
        "\t\t\t\"preShow\": false,\n" +
        "\t\t\t\"sc\": 0,\n" +
        "\t\t\t\"globalReleased\": false,\n" +
        "\t\t\t\"wish\": 81501,\n" +
        "\t\t\t\"star\": \"黄才伦,张慧雯,沈腾\",\n" +
        "\t\t\t\"rt\": \"2021-03-19\",\n" +
        "\t\t\t\"showInfo\": \"2021-03-19 本周五上映\",\n" +
        "\t\t\t\"showst\": 4,\n" +
        "\t\t\t\"wishst\": 0,\n" +
        "\t\t\t\"comingTitle\": \"3月19日 周五\"\n" +
        "\t\t},\n" +
        "\t\t{\n" +
        "\t\t\t\"id\": 1298359,\n" +
        "\t\t\t\"haspromotionTag\": false,\n" +
        "\t\t\t\"img\": \"http://p0.meituan.net/w.h/moviemachine/152b0b645bb435296195595431a4614a1647101.jpg\",\n" +
        "\t\t\t\"version\": \"\",\n" +
        "\t\t\t\"nm\": \"又见奈良\",\n" +
        "\t\t\t\"preShow\": false,\n" +
        "\t\t\t\"sc\": 0,\n" +
        "\t\t\t\"globalReleased\": false,\n" +
        "\t\t\t\"wish\": 14729,\n" +
        "\t\t\t\"star\": \"吴彦姝,英泽,国村隼\",\n" +
        "\t\t\t\"rt\": \"2021-03-19\",\n" +
        "\t\t\t\"showInfo\": \"2021-03-19 本周五上映\",\n" +
        "\t\t\t\"showst\": 4,\n" +
        "\t\t\t\"wishst\": 0,\n" +
        "\t\t\t\"comingTitle\": \"3月19日 周五\"\n" +
        "\t\t},\n" +
        "\t\t{\n" +
        "\t\t\t\"id\": 1229373,\n" +
        "\t\t\t\"haspromotionTag\": false,\n" +
        "\t\t\t\"img\": \"http://p1.meituan.net/w.h/movie/2eed1348e2aee4a4eb1cc840999571712192803.jpg\",\n" +
        "\t\t\t\"version\": \"\",\n" +
        "\t\t\t\"nm\": \"21座桥\",\n" +
        "\t\t\t\"preShow\": false,\n" +
        "\t\t\t\"sc\": 0,\n" +
        "\t\t\t\"globalReleased\": false,\n" +
        "\t\t\t\"wish\": 11671,\n" +
        "\t\t\t\"star\": \"查德维克·博斯曼,西耶娜·米勒,史蒂芬·詹姆士\",\n" +
        "\t\t\t\"rt\": \"2021-03-19\",\n" +
        "\t\t\t\"showInfo\": \"2021-03-19 本周五上映\",\n" +
        "\t\t\t\"showst\": 4,\n" +
        "\t\t\t\"wishst\": 0,\n" +
        "\t\t\t\"comingTitle\": \"3月19日 周五\"\n" +
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
        "\t\t\t\"wishst\": 0,\n" +
        "\t\t\t\"comingTitle\": \"3月19日 周五\"\n" +
        "\t\t},\n" +
        "\t\t{\n" +
        "\t\t\t\"id\": 1355793,\n" +
        "\t\t\t\"haspromotionTag\": false,\n" +
        "\t\t\t\"img\": \"http://p1.meituan.net/w.h/movie/ce78bde165804ea060620b7c9e99c2f25023185.jpg\",\n" +
        "\t\t\t\"version\": \"\",\n" +
        "\t\t\t\"nm\": \"往事如昨\",\n" +
        "\t\t\t\"preShow\": false,\n" +
        "\t\t\t\"sc\": 0,\n" +
        "\t\t\t\"globalReleased\": false,\n" +
        "\t\t\t\"wish\": 1498,\n" +
        "\t\t\t\"star\": \"邱宗华,郑勇,杨娇\",\n" +
        "\t\t\t\"rt\": \"2021-03-19\",\n" +
        "\t\t\t\"showst\": 1,\n" +
        "\t\t\t\"wishst\": 0,\n" +
        "\t\t\t\"comingTitle\": \"3月19日 周五\"\n" +
        "\t\t},\n" +
        "\t\t{\n" +
        "\t\t\t\"id\": 1309640,\n" +
        "\t\t\t\"haspromotionTag\": false,\n" +
        "\t\t\t\"img\": \"http://p0.meituan.net/w.h/moviemachine/66e69d0559ad525a3b6684d5f9c0b3ba1814251.jpg\",\n" +
        "\t\t\t\"version\": \"\",\n" +
        "\t\t\t\"nm\": \"平安中国之守护者\",\n" +
        "\t\t\t\"preShow\": false,\n" +
        "\t\t\t\"sc\": 0,\n" +
        "\t\t\t\"globalReleased\": false,\n" +
        "\t\t\t\"wish\": 466,\n" +
        "\t\t\t\"star\": \"赵刚,宁南,王琳娜\",\n" +
        "\t\t\t\"rt\": \"2021-03-19\",\n" +
        "\t\t\t\"showst\": 1,\n" +
        "\t\t\t\"wishst\": 0,\n" +
        "\t\t\t\"comingTitle\": \"3月19日 周五\"\n" +
        "\t\t},\n" +
        "\t\t{\n" +
        "\t\t\t\"id\": 1403466,\n" +
        "\t\t\t\"haspromotionTag\": false,\n" +
        "\t\t\t\"img\": \"http://p0.meituan.net/w.h/moviemachine/c1e9331f7b6dc442981db08bab91ca5e925806.jpg\",\n" +
        "\t\t\t\"version\": \"\",\n" +
        "\t\t\t\"nm\": \"一些往事\",\n" +
        "\t\t\t\"preShow\": false,\n" +
        "\t\t\t\"sc\": 0,\n" +
        "\t\t\t\"globalReleased\": false,\n" +
        "\t\t\t\"wish\": 407,\n" +
        "\t\t\t\"star\": \"杜帅,张文,王立功\",\n" +
        "\t\t\t\"rt\": \"2021-03-19\",\n" +
        "\t\t\t\"showst\": 1,\n" +
        "\t\t\t\"wishst\": 0,\n" +
        "\t\t\t\"comingTitle\": \"3月19日 周五\"\n" +
        "\t\t}\n" +
        "\t],\n" +
        "\t\"movieIds\": [\n" +
        "\t\t1372081,\n" +
        "\t\t1218437,\n" +
        "\t\t1298359,\n" +
        "\t\t1229373,\n" +
        "\t\t1263157,\n" +
        "\t\t1355793,\n" +
        "\t\t1309640,\n" +
        "\t\t1403466,\n" +
        "\t\t1377765,\n" +
        "\t\t1281464,\n" +
        "\t\t343568,\n" +
        "\t\t1280929,\n" +
        "\t\t1355834,\n" +
        "\t\t1302233,\n" +
        "\t\t1222234,\n" +
        "\t\t345006,\n" +
        "\t\t1229308,\n" +
        "\t\t1322057,\n" +
        "\t\t1204411,\n" +
        "\t\t1338984,\n" +
        "\t\t1297996,\n" +
        "\t\t1375624,\n" +
        "\t\t337487,\n" +
        "\t\t1285582,\n" +
        "\t\t1336427,\n" +
        "\t\t1250676,\n" +
        "\t\t248836,\n" +
        "\t\t1302373,\n" +
        "\t\t1328840,\n" +
        "\t\t1212303,\n" +
        "\t\t1359285,\n" +
        "\t\t632158,\n" +
        "\t\t1405621,\n" +
        "\t\t1241385,\n" +
        "\t\t1211382,\n" +
        "\t\t1383416,\n" +
        "\t\t1301501,\n" +
        "\t\t1320283,\n" +
        "\t\t1366776,\n" +
        "\t\t1302287,\n" +
        "\t\t1301020,\n" +
        "\t\t1204322,\n" +
        "\t\t1336183,\n" +
        "\t\t1378057,\n" +
        "\t\t1370805,\n" +
        "\t\t1218188,\n" +
        "\t\t1357145,\n" +
        "\t\t1371295,\n" +
        "\t\t1212627,\n" +
        "\t\t1337941,\n" +
        "\t\t1375543,\n" +
        "\t\t1363244,\n" +
        "\t\t1220824,\n" +
        "\t\t1368677,\n" +
        "\t\t1401786,\n" +
        "\t\t1287590,\n" +
        "\t\t1356063,\n" +
        "\t\t1284360,\n" +
        "\t\t672203,\n" +
        "\t\t1301249,\n" +
        "\t\t1298381,\n" +
        "\t\t1300115,\n" +
        "\t\t1359034\n" +
        "\t]\n" +
        "}"