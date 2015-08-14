
public abstract class RemoteButton {

		private EntertainmentDevice theDevice ;
		
		public RemoteButton(EntertainmentDevice newDevice) {
			theDevice = newDevice ;
		}
		
		public void buttonFivePressed() {
			theDevice.buttonFivePressed();
		}
		
		public void buttonSixPressed() {
			theDevice.buttonSixPressed();
		}
		
		public void buttonSevenPressed() {
			theDevice.buttonSevenPressed();
		}
		
		public void buttonEightPressed() {
			theDevice.buttonEightPressed();
		}
		
		public void deviceFeedback() {
			theDevice.deviceFeedback();
		}
		
		public abstract void buttonNinePressed();
}
