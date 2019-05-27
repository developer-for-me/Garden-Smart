package ro.arduino;

import gnu.io.CommPort;
import gnu.io.CommPortIdentifier;
import gnu.io.SerialPort;
import gnu.io.SerialPortEvent;
import gnu.io.SerialPortEventListener;
import javafx.fxml.FXML;
import javafx.scene.control.Label;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;


public class Connect implements SerialPortEventListener {


    /**
     * Seial port
     */
    public static String s ;
    @FXML
    private Label label1;
    private SerialPort serialPort;
    private InputStream serialIn;
    private OutputStream serialOut;
    private BufferedReader serialReader;

    public void begin() throws Exception {
        // Open port
        CommPortIdentifier port = CommPortIdentifier.getPortIdentifier("COM6");
        CommPort commPort = port.open(this.getClass().getName(), 2000);
        serialPort = (SerialPort) commPort;
        serialPort.setSerialPortParams(115200, SerialPort.DATABITS_8, SerialPort.STOPBITS_1, SerialPort.PARITY_NONE);
        serialIn = serialPort.getInputStream();
        serialOut = serialPort.getOutputStream();
        serialReader = new BufferedReader(new InputStreamReader(serialIn));
        serialPort.addEventListener(this);
        serialPort.notifyOnDataAvailable(true);

    }
    /**
     * Each info send by ARDUINO is taken here

     */
    @Override
    @FXML
    public void serialEvent(SerialPortEvent e) {
        try {
            String line = serialReader.readLine();

            System.out.println(line);
            s=line;
            label1.setText(line);

        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }



}
