package gameapi.event.base;

import cn.nukkit.Player;
import cn.nukkit.event.Cancellable;
import cn.nukkit.event.Event;
import cn.nukkit.event.HandlerList;
import gameapi.room.Room;

/**
 * @author Glorydark
 */
public class RoomPlayerLeaveEvent extends Event implements Cancellable {
    private static final HandlerList handlers = new HandlerList();
    private final Room room;
    private final Player player;

    public static HandlerList getHandlers() {
        return handlers;
    }

    public RoomPlayerLeaveEvent(Room room, Player player){
        this.room = room;
        this.player = player;
    }

    public Room getRoom(){ return room;}

    public Player getPlayer() {
        return this.player;
    }
}
