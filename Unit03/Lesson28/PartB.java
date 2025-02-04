/*
 * Juan
 * 2/4/25
 * 
 * Suppose you have designed an inheritance hierarchy that includes the
 * following relationships:
 * 
 * Guitar is a subclass of Instrument
 * AcousticGuitar is a subclass of Guitar
 * ElectricGuitar is a subclass of Guitar
 * 
 * Given the declarations below, which of the objects CANNOT be passed to the
 * method tune(Guitar g) and why??
 * 
 * AcousticGuitar ag;
 * ElectricGuitar eg;
 * Guitar myGuitar;
 * Instrument myInstrument;
 * 
 * Instrument myInstrument;
 * because it is not specific enough, meaning that it might not be a guitar
 */