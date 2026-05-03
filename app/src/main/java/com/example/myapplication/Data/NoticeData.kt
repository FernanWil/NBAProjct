package com.example.myapplication.Data

data class News(
    val title: String,
    val description: String,
    val imageUrl: String,
    val url: String
)
val newsList = listOf(

    News(
        title = "Playoffs NBA 2026 en marcha",
        description = "Los playoffs de la NBA 2026 ya comenzaron con enfrentamientos intensos rumbo a las Finales. Los equipos compiten por el campeonato en una de las postemporadas más emocionantes recientes.",
        imageUrl = "https://a57.foxsports.com/statics.foxsports.com/www.foxsports.com/content/uploads/2026/01/1294/728/16x9steel.jpg?ve=1&tl=1",
        url = "https://www.espn.com/nba/story/_/id/48419498/nba-playoffs-2026-play-finals-schedule-scores-news-highlights-bracket-dates"
    ),

    News(
        title = "Oklahoma City Thunder avanza con barrida",
        description = "El Thunder eliminó a los Suns con un contundente 4-0, convirtiéndose en el primer equipo en avanzar a la siguiente ronda de los playoffs.",
        imageUrl = "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcRdFR7JYNV9f3UfiJK2rMDZmrFpKsLb1jFgJA&s",
        url = "https://www.cbssports.com/nba/news/2026-nba-playoff-bracket-matchups-schedule/"
    ),

    News(
        title = "NBA planea cambio en el draft (regla 3-2-1)",
        description = "La liga estudia un nuevo sistema de lotería del draft para reducir el tanking y hacer la competencia más justa entre los equipos.",
        imageUrl = "https://cdn.phenompeople.com/CareerConnectResources/NBANBAUS/social/1200x630-1670500675022.jpg",
        url = "https://www.reuters.com/sports/report-nba-finalizing-3-2-1-draft-lottery-reform-proposal--flm-2026-04-28/"
    ),

    News(
        title = "NBA y FIBA evalúan liga en Europa",
        description = "La NBA, junto a FIBA y EuroLeague, está en conversaciones para crear una nueva liga en Europa con equipos en grandes ciudades.",
        imageUrl = "https://www.2playbook.com/uploads/s1/47/98/24/nba-fiba-europa_14_744x403.jpeg",
        url = "https://www.reuters.com/sports/nba-fiba-euroleague-hold-constructive-talks-potential-european-league-2026-04-28/"
    ),

    News(
        title = "Cooper Flagg gana el Rookie del Año",
        description = "El joven talento de los Mavericks fue nombrado Novato del Año tras una temporada destacada en la NBA.",
        imageUrl = "https://cdn.nba.com/teams/uploads/sites/1610612742/2026/04/Cooper-Flagg-AKA-22Rookie-of-the-Year22-Season-Highlights.jpg",
        url = "https://elpais.com/deportes/baloncesto/2026-04-28/cooper-flagg-heredero-de-luka-doncic-en-los-dallas-mavericks-elegido-novato-del-ano-en-la-nba.html"
    )
)


data class VideosPlays(
    val title: String,
    val url: String
)
val videosList = listOf(

    VideosPlays(
        title = "Los mejores movimientos en los playoffs",
        url = "EMWUn_HTW5Q"
    ),
    VideosPlays(
        title = "Jugadas sin ayuda, con presion y con puntos",
        url = "MOGEbEN21ck"
    ),
    VideosPlays(
        title = "Las mayores faltas de respeto en NBA 2026",
        url = "HKQlPge3BKk"
    ),
)