package jforgame.socket.combine;

import com.baidu.bjf.remoting.protobuf.annotation.ProtobufClass;
import jforgame.socket.annotation.MessageMeta;
import jforgame.socket.message.Message;

import java.util.ArrayList;
import java.util.List;

/**
 * special message used to combine lots of messages together
 * @author kinson
 */
@MessageMeta()
@ProtobufClass
public final class CombineMessage extends Message {

	private List<Packet> packets = new ArrayList<>();

	public CombineMessage(){

	}

	/**
	 * add new message to combine queue
	 * @param message
	 */
	public void addMessage(Message message){
		this.packets.add(Packet.valueOf(message));
	}

	public List<Packet> getPackets() {
		return packets;
	}

	public int getCacheSize(){
		return this.packets.size();
	}

}
