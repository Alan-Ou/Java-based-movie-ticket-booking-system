package com.app.movie.bean

import java.io.Serializable

/**
 *    author : yi.huangxing
 *    date   : 2021/3/16/0016  12:41
 *    desc   :
 */

data class MovieDetailBean(
    val detailMovie: DetailMovie
) : Serializable

data class DetailMovie(
    val albumImg: String,
    val availableEpisodes: Int,
    val awardUrl: String,
    val backgroundColor: String,
    val bingeWatch: Int,
    val bingeWatchst: Int,
    val cat: String,
    val comScorePersona: Boolean,
    val commented: Boolean,
    val dir: String,
    val distributions: List<Distribution>,
    val dra: String,
    val dur: Int,
    val egg: Boolean,
    val enm: String,
    val episodeDur: Int,
    val episodes: Int,
    val filmAlias: String,
    val fra: String,
    val frt: String,
    val globalReleased: Boolean,
    val guideToWish: Boolean,
    val id: Int,
    val img: String,
    val latestEpisode: Int,
    val modcsSt: Boolean,
    val movieType: Int,
    val multiPub: Boolean,
    val musicName: String,
    val musicNum: Int,
    val musicStar: String,
    val nm: String,
    val onSale: Boolean,
    val onlinePlay: Boolean,
    val orderSt: Int,
    val oriLang: String,
    val photos: List<String>,
    val pn: Int,
    val preScorePersona: Boolean,
    val proScore: Int,
    val proScoreNum: Int,
    val pubDate: Long,
    val pubDesc: String,
    val rt: String,
    val sc: Double,
    val scm: String,
    val scoreLabel: String,
    val shareInfo: ShareInfo,
    val showst: Int,
    val snum: Int,
    val src: String,
    val star: String,
    val type: Int,
    val vd: String,
    val ver: String,
    val version: String,
    val videoImg: String,
    val videoName: String,
    val videourl: String,
    val viewedSt: Int,
    val vnum: Int,
    val vodFreeSt: Int,
    val vodPlay: Boolean,
    val vodSt: Int,
    val watched: Int,
    val wish: Int,
    val wishst: Int
) : Serializable

data class Distribution(
    val movieScoreLevel: String,
    val proportion: String
) : Serializable

data class ShareInfo(
    val channel: Int,
    val content: String,
    val img: String,
    val title: String,
    val url: String
) : Serializable