class Player(val name:String, var score:Int = 0, var level:Int = 1, var lives:Int = 3, var status:String = "Vastgebonden") {

    var message:String = "Je hebt een kans verloren vanwege onjuist keuze"

    val ansi_red = "\u001b[31m"
    val ansi_green = "\u001b[32m"
    val ansi_yelllo = "\u001b[33m"
    val ansi_blue = "\u001b[34m"
    val ansi_white = "\u001b[0m"
    val blod_green = "\u001b[32;1m"
    val mageneta = "\u001b[35;1m"
    val underline = "\u001b[4m"
    val bold = "\u001b[1m"

    fun show() {

        println("""
            name: $name
            score: $score
            level: $level
            lives: $lives
            status: $status
            """)
    }

    fun huidigeStatus(){
        println("Typ hier het woord$ansi_blue status$ansi_white om je huidige status te bekijken:")
        var statusButton:String = readLine()!!.toLowerCase()

        while(statusButton != "status"){
            println("$ansi_red"+"Je hebt iets fout getypt probeer het nogmaals opnieuw")

            statusButton = readLine()!!.toLowerCase()
        }
    }

    fun goedBeslissing_level1(){
        var optellen = score + 20
        level++

        status = "vrijlaten"

        println("""
            name: $name
            score: $optellen
            level: $level
            lives: $lives
            status: $status
            """)
    }

    fun foutBeslissing_level1(){
        level++
        lives--
        status = "vrijlaten"

        println("""
            name: $name
            score: $score
            level: $level
            lives: $lives
            status: $status
            message: $message
            """)
    }

    fun goedBeslissing_level2(){
        var optellen = score + 40
        level++
        status = "Wapen zoeken"

        println("""
            name: $name
            score: $optellen
            level: $level
            lives: $lives
            status: $status
            """)
    }

    fun foutBeslissing_level2(){

        var optellen = score + 20
        level++
        status = "Wapen zoeken"
        lives--

        println("""
            name: $name
            score: $optellen
            level: $level
            lives: $lives
            status: $status
            message: $message
            """)
    }

}