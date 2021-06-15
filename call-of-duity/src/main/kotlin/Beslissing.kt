class Beslissing() {

    val ansi_red = "\u001b[31m"
    val ansi_green = "\u001b[32m"
    val ansi_yelllo = "\u001b[33m"
    val ansi_blue = "\u001b[34m"
    val ansi_white = "\u001b[0m"
    val blod_green = "\u001b[32;1m"
    val mageneta = "\u001b[35;1m"
    val underline = "\u001b[4m"
    val bold = "\u001b[1m"

    fun keuze1_goed() {
        println("$ansi_green"+"Gefeliciteerd$ansi_white man je hebt het goede element gekzoen:")
    }

     fun keuze1_fout() {
        println("$ansi_white"+"Deze kueze is$ansi_red fout$ansi_white genoteerd")
        }

     fun keuze2_goed(){
        println("$ansi_white"+"wowww Je lijkt op een helder te zijn")
    }

     fun keuze2_fout(){
        println("$ansi_white"+"Jammer man je hebt het foute beslissing genomen")
    }
}