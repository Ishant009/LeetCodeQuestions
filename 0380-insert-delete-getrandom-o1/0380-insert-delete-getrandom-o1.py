class RandomizedSet:

    def __init__(self):
        self.map = {}   

    def insert(self, val: int) -> bool:
        if val not in self.map:
            self.map[val] = 1
            return True
        return False

    def remove(self, val: int) -> bool:
        if val in self.map:
            del self.map[val]
            return True
        return False
        

    def getRandom(self) -> int:
        keys_list = list(self.map.keys())
        random_index = random.randint(0, len(keys_list) - 1)  # Corrected random range
        return keys_list[random_index]
        


# Your RandomizedSet object will be instantiated and called as such:
# obj = RandomizedSet()
# param_1 = obj.insert(val)
# param_2 = obj.remove(val)
# param_3 = obj.getRandom()