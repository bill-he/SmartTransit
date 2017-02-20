class Train(object):

	def __init__(self, inID, inPos, inVel):
		self.ID = inID
		self.pos = inPos
		self.Vel = inVel

	def test(self):
		print("Hello World!")

	def printInfo(self):
		print("---Info for Train ID: " \
			+ str(self.ID) + "\n" \
			+ "Pos: " + str(self.pos) + "\n" \
			+ "Vel: " + str(self.Vel))
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

#Vel
	def setVel(self, inVel):
		self.Vel=inVel

	def getVel(self):
		return self.Vel