class Station(object):

	def __init__(self, inID, inPos, inVel):
		self.ID = inID
		self.pos = inPos
		self.Vel = inVel
		
	def test(self):
		print("Hello World!")

	def printInfo(self):
		print("---Info for Station ID: " \
				+ str(self.ID) + "\n" \
			+ "Pos: " + str(self.pos))

#ID
	def setID(self, inID):
		self.ID=inID

	def getID(self):
		return self.ID

#Pos
	def setPos(self, inPos):
		self.pos=inPos

	def getPos(self):
		return self.pos