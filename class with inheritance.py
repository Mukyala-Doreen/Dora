class Superhero:
    def __init__(self, name, power, universe):
        self.name = name
        self.power = power
        self.universe = universe

    def introduce(self):
        print(f"I am {self.name} from {self.universe}, and my power is {self.power}!")

class FlyingHero(Superhero):
    def __init__(self, name, power, universe, flight_speed):
        super().__init__(name, power, universe)
        self.flight_speed = flight_speed

    def introduce(self):
        super().introduce()
        print(f"I can fly at {self.flight_speed} mph!")

# Example usage:
hero1 = Superhero("ShadowStrike", "Invisibility", "DarkVerse")
hero2 = FlyingHero("SkyFlash", "Lightning Control", "Aether Realm", 900)

hero1.introduce()
hero2.introduce()
