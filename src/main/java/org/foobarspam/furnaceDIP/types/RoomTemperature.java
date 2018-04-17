package org.foobarspam.furnaceDIP.types;

public class RoomTemperature {
	
	private double temperature = 0;
        private static RoomTemperature roomTemperature;
	
	private RoomTemperature(double temperature){
		this.temperature = temperature;
	}

        public static RoomTemperature getSingletonInstance(double temperature){
            if(roomTemperature == null){
                roomTemperature = new RoomTemperature(temperature);
                return roomTemperature;
            }
            else{
                roomTemperature.setTemperature(temperature);
                return roomTemperature;
            }
        }
        
	public double getTemperature() {
		return this.temperature;
	}

	public void setTemperature(double temperature) {
		this.temperature = temperature;
	}
	
	public void incrementTemperature(double increment){
		this.temperature += increment;
	}

}
