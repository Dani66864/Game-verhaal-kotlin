open class GameSettings() {

    val ansi_red = "\u001b[31m"
    val ansi_green = "\u001b[32m"
    val ansi_yelllo = "\u001b[33m"
    val ansi_blue = "\u001b[34m"
    val ansi_white = "\u001b[0m"
    val blod_green = "\u001b[32;1m"
    val mageneta = "\u001b[35;1m"
    val underline = "\u001b[4m"
    val bold = "\u001b[1m"

    fun gameRegels() {
        println(
            "$ansi_yelllo" + "Onze regels van deze speeltje zit het zo eruit:\n" +
                    "1-Als je bent miderjarig dan kun je het speeltje niet spelen\n" +
                    "2-Als heb je niet het goede beslissing gekozen dan gaat het 1 kans van je eraf\n" +
                    "3-Als heb je 3 kasnen verloren dan moet je helemaal opnieuw gaan beginnen\n" +
                    "4-Als heb je de foutieve beslissing gekozen dan ga je wel door naar de volgende level\n" +
                    "maar je gaat wel 1 kans missen\n" +
                    "5-Als heb je het goede route gekzoen dan krijg van iedere 20 punten erbij\n" +
                    "6-De totale score (komt nog)\n\n" +
                    "-------------------------------------------------------------------------------------"
        )

        println("$blod_green" + "Het zijn de jaren vijftig en de koude oorlog is in volle gang. \n")
    }

    fun nameinput() {
        println("$ansi_white" + "Uw naam graag invoeren?")
        var username: String? = readLine()

        while (username!!.isBlank()) {
            println("$ansi_red" + "Deze veld is verplicht op te invullen.")
            username = readLine()
        }

        println("$ansi_white" + "Welkom " + "$mageneta" + username + "$ansi_white in de call of duty game, \n")

    }

    fun kledingKiezen(){
        println(
            "$ansi_white"+"Wat wil je aandragen tijdens het spelen: \n" +
                    "$ansi_blue"+"1-helm\n" +
                    "2-schoenen\n" +
                    "3-bril\n" +
                    "4-broek\n"
        )
        println("$ansi_white"+"Typ het nummer vanuit het volgende mogelijkheiden:")

        var karakter = readLine()!!.toInt()

        while (karakter != 1 && karakter != 2 && karakter != 3 && karakter != 4 ){
            println("$ansi_red"+"Jij hebt het onjuiste nummer gekozen, probeer het nogmaals onpieuw... $ansi_white")
            karakter = readLine()!!.toInt()
        }

        when (karakter) {
            1   -> println("Jij hebt$ansi_blue helm$ansi_white gekozen")
            2 -> println("Jij hebt$ansi_blue schoenen$ansi_white gekozen")
            3 -> println("Jij hebt$ansi_blue bril$ansi_white gekozen")
            4 -> println("Jij hebt$ansi_blue broek$ansi_white gekozen")
        }

        println("$ansi_white"+"-----------------------------------------------------\n")
    }

    fun startVerhaal(){

        println("Typ$ansi_blue start$ansi_white om het verhaal te laten beginnen:")

        var startbutton:String? = readLine()!!.toLowerCase()
//        println(startbutton)

        while (startbutton!= "start"){
            println("$ansi_red"+"Deze veld is verplicht op te invullen")
            println("$ansi_white"+"Typ$mageneta start$ansi_white om het verhaal te laten beginnen")
            startbutton = readLine()!!.toLowerCase()
        }
        println("Het verhaal van deze game is begonnen je kunt een spannende verhaal gaan verwachten!\n" +
                "------------------------GESTART-----------------------------\n\n")
    }
}