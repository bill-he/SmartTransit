#Import classes: Train
from Train import *

#Import infrastructure
#import numpy as np
import matplotlib as mpl

#Train Setup

trainRoster = []

trainRoster.append(Train(1, 1, 1))

#Simulation Setup

t=0
dt = 1
tmax = 10

#Run Simulation

while t < tmax:

	for train in trainRoster:
		train.setPos(train.getVel()*dt + train.getPos())
		train.printInfo()

	t = t + dt