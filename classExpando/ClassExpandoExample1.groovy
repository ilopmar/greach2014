def carA = new Expando()
def carB = new Expando(year: 2014, kilometers: 0)

String var1 = "year"
String var2 = "kilometers"

carA."${var1}" = 2014
carA."${var2}" = 20

println "carA: " + carA
println "carB: " + carB

def car = new Expando(year: 2012, kilometers: 100, turn: { println 'turning...' })
car.drive = {
    kilometers += 10
    println "${kilometers} kilometers driven"
}

car.drive()
car.turn()