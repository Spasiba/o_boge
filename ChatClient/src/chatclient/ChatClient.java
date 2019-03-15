/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chatclient;
import java.awt.*;

public class ChatClient {
// insert code here

private TextArea output;
private TextField input;
private Button sendButton;
private Button quitButton;
public ChatClient() {
output = new TextArea(10,50);
input = new TextField(50);
sendButton = new Button("Send");
quitButton = new Button("Quit");
}
public void launchFrame() {
Frame frame = new Frame("Chat Room");
// Use the Border Layout for the frame
frame.setLayout(new BorderLayout());
frame.add(output, BorderLayout.WEST);
frame.add(input, BorderLayout.SOUTH);
// Create the button panel
Panel p1 = new Panel();
p1.setLayout(new GridLayout(2,1));
p1.add(sendButton);
p1.add(quitButton);
// Add the button panel to the center
frame.add(p1, BorderLayout.CENTER);
frame.pack();
frame.setVisible(true);
}
public static void main(String[] args) {
ChatClient c = new ChatClient();
c.launchFrame();
}
}
