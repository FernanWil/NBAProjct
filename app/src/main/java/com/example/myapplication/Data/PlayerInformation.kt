package com.example.myapplication.Data

import com.example.myapplication.R

data class Goals(
    val title: String,
    val description: String
)
data class PlayerInformation(
    val id: String,
    val age: Int,
    val height: String,
    val name: String,
    val description: String,
    val img: Int,
    val goals: List<Goals>,
    )

val players = listOf(

    PlayerInformation(
        id = "lebron",
        name = "LeBron James",
        age = 41,
        height = "2.09 cm",
        description = "Alero extremadamente versátil, capaz de influir en todas las áreas del juego gracias a su físico, inteligencia y longevidad.",
        img = R.drawable.lb,
        goals = listOf(
            Goals(
                "Máximo anotador histórico",
                "Superó el récord de Kareem Abdul-Jabbar, convirtiéndose en el jugador con más puntos en la historia de la NBA."
            ),
            Goals(
                "Más de 40,000 puntos",
                "Primer jugador en alcanzar esta cifra, demostrando consistencia ofensiva durante más de dos décadas."
            ),
            Goals(
                "4× campeón de la NBA",
                "Ganó títulos con diferentes equipos, mostrando liderazgo en distintos contextos."
            ),
            Goals(
                "4× MVP",
                "Reconocido como el jugador más valioso en múltiples temporadas."
            ),
            Goals(
                "40k/10k/10k",
                "Único jugador con más de 40 mil puntos, 10 mil rebotes y 10 mil asistencias."
            )
        )
    ),

    PlayerInformation(
        id = "curry",
        name = "Stephen Curry",
        age = 36,
        height = "1.88 cm",
        description = "Base revolucionario que transformó el baloncesto moderno con su tiro de tres puntos y movilidad sin balón.",
        img = R.drawable.stp,
        goals = listOf(
            Goals(
                "Máximo triplista histórico",
                "Superó todos los récords de triples, cambiando la forma en que se juega el baloncesto."
            ),
            Goals(
                "4× campeón de la NBA",
                "Líder de los Warriors en una de las dinastías más dominantes."
            ),
            Goals(
                "MVP unánime",
                "Primer jugador en ganar el MVP de forma unánime en 2016."
            ),
            Goals(
                "MVP Finales 2022",
                "Confirmó su legado liderando a su equipo al campeonato."
            )
        )
    ),

    PlayerInformation(
        id = "edwards",
        name = "Anthony Edwards",
        age = 24,
        height = "1.93 cm",
        description = "Escolta joven con gran explosividad y capacidad anotadora, considerado una futura superestrella.",
        img = R.drawable.ae4,
        goals = listOf(
            Goals(
                "#1 del Draft 2020",
                "Seleccionado como la principal promesa de su generación."
            ),
            Goals(
                "All-Star",
                "Reconocido rápidamente como uno de los mejores jóvenes de la liga."
            ),
            Goals(
                "Impacto en playoffs",
                "Ha demostrado personalidad en escenarios de alta presión."
            ),
            Goals(
                "Proyección de superestrella",
                "Considerado uno de los futuros rostros de la NBA."
            )
        )
    ),

    PlayerInformation(
        id = "durant",
        name = "Kevin Durant",
        age = 37,
        height = "2.11 cm",
        description = "Alero élite con una capacidad anotadora excepcional y gran eficiencia en el tiro.",
        img = R.drawable.kd1,
        goals = listOf(
            Goals(
                "2× campeón de la NBA",
                "Pieza clave en campeonatos con Golden State."
            ),
            Goals(
                "2× MVP de las Finales",
                "Dominó en el escenario más importante del baloncesto."
            ),
            Goals(
                "MVP 2014",
                "Reconocido como el mejor jugador de la liga ese año."
            ),
            Goals(
                "4× líder anotador",
                "Consistentemente entre los máximos anotadores."
            ),
            Goals(
                "Club 50-40-90",
                "Logró porcentajes de tiro excepcionales."
            )
        )
    ),

    PlayerInformation(
        id = "jordan",
        name = "Michael Jordan",
        age = 64,
        height = "1.98 cm",
        description = "Considerado por muchos el mejor jugador de la historia, con dominio absoluto en los años 90.",
        img = R.drawable.mj1,
        goals = listOf(
            Goals(
                "6× campeón de la NBA",
                "Ganó todas las finales que disputó, sin derrotas."
            ),
            Goals(
                "6× MVP de las Finales",
                "Siempre fue el jugador más decisivo en los campeonatos."
            ),
            Goals(
                "5× MVP",
                "Dominó la liga como el mejor jugador en múltiples temporadas."
            ),
            Goals(
                "10× líder anotador",
                "Uno de los mayores dominadores ofensivos."
            ),
            Goals(
                "Defensor del Año",
                "También destacó como defensor élite."
            )
        )
    ),

    PlayerInformation(
        id = "rodman",
        name = "Dennis Rodman",
        age = 64,
        height = "2.01 cm",
        description = "Especialista defensivo y reboteador, reconocido por su intensidad y estilo único.",
        img = R.drawable.dr3,
        goals = listOf(
            Goals(
                "5× campeón de la NBA",
                "Jugador clave en equipos campeones, especialmente con los Bulls."
            ),
            Goals(
                "2× Defensor del Año",
                "Reconocido por su defensa sobre los mejores jugadores."
            ),
            Goals(
                "7× líder en rebotes",
                "Dominó los tableros durante varias temporadas."
            ),
            Goals(
                "Impacto defensivo histórico",
                "Considerado uno de los mejores defensores de todos los tiempos."
            )
        )
    ),

    PlayerInformation(
        id = "kyrie",
        name = "Kyrie Irving",
        age = 34,
        height = "1.88 cm",
        description = "Base con habilidades técnicas excepcionales y uno de los mejores manejadores de balón.",
        img = R.drawable.kr1,
        goals = listOf(
            Goals(
                "Campeón NBA 2016",
                "Parte fundamental del título de Cleveland."
            ),
            Goals(
                "Tiro decisivo en Finales",
                "Anotó el triple clave en el Juego 7 de 2016."
            ),
            Goals(
                "Rookie del Año",
                "Impactó desde su primera temporada en la liga."
            ),
            Goals(
                "Manejo de balón élite",
                "Considerado uno de los mejores dribladores de la historia."
            )
        )
    )
)