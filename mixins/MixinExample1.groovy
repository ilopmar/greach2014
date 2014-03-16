class SpidermanPower {
    String spiderSense() {
        "Using spider-sense..."
    }
}

class CyclopsPower {
    String laserBlast() {
        "Firing laser blast!"
    }
}

class SupermanPower {
    String fly() {
        "Flying..."
    }

    String superSpeed() {
        "Super-speed!!!"
    }
}


@Mixin([SpidermanPower, SupermanPower])
class Person {}

def person = new Person()
assert "Using spider-sense..." == person.spiderSense()
assert "Flying..." == person.fly()
assert "Super-speed!!!" == person.superSpeed()

Person.mixin CyclopsPower
assert "Firing laser blast!" == person.laserBlast()