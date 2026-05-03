package com.example.myapplication.Data

import com.example.myapplication.R

data class Media(
    val img: List<Int>,
    val video: String
)
data class VideosPlayer(
    val id: String,
    val name: String,
    val media: Media,
)

val multimedia = listOf(
    VideosPlayer(
        id = "lebron",
        name = "Lebron James",
        media = Media(
            img = listOf(
                R.drawable.dunk,
                R.drawable.ptsbron,
                R.drawable.king
            ),
            video = "YOG1KL_rpVQ"
        )
    ),
    VideosPlayer(
        id = "curry",
        name = "Stephen Curry",
        media = Media(
            img = listOf(R.drawable.dunk),
            video = "hUOfC2ilXak"
        )
    ),
    VideosPlayer(
        id = "durant",
        name = "Kevin Durant",
        media = Media(
            img = listOf(R.drawable.kd2, R.drawable.kd1, R.drawable.kd),
            video = "-ikmc0D31x4"
        )
    ),
    VideosPlayer(
        id = "edwards",
        name = "Anthony Edwards",
        media = Media(
            img = listOf(R.drawable.ae1,R.drawable.ae2,R.drawable.ae4),
            video = "_e4jWFr9oj0"
        )
    ),
    VideosPlayer(
        id = "jordan",
        name = "Michael Jordan",
        media = Media(
            img = listOf(R.drawable.mj1),
            video = "jbW4f60dCNA"
        )
    ),
    VideosPlayer(
        id = "rodman",
        name = "Dennis Rodman",
        media = Media(
            img = listOf(R.drawable.dr1,R.drawable.dr3,R.drawable.drp),
            video = "6wLNfajEZSw"
        )
    ),
    VideosPlayer(
        id = "kyrie",
        name = "Kyrie Irving",
        media = Media(
            img = listOf(R.drawable.kr1, R.drawable.kr),
            video = "1Dv63K05MzQ"
        )
    ),
)