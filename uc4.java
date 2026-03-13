/**
 * ==============================================================
 * MAIN CLASS - UseCase4RoomSearch
 * ==============================================================
 *
 * Use Case 4: Room Search & Availability Check
 *
 * Description:
 * This class demonstrates how guests
 * can view available rooms without
 * modifying inventory data.
 *
 * The system enforces read-only access
 * by design and usage discipline.
 *
 * @version 4.0
 */

public class UseCase4RoomSearch {

    /**
     * Application entry point.
     *
     * @param args Command-line arguments
     */
    public static void main(String[] args) {

        RoomInventory inventory = new RoomInventory();

        Room singleRoom = new Room(1, 250, 1500.0) {};
        Room doubleRoom = new Room(2, 400, 2500.0) {};
        Room suiteRoom = new Room(3, 750, 5000.0) {};

        RoomSearchService service = new RoomSearchService();

        System.out.println("Room Search\n");

        service.searchAvailableRooms(
                inventory,
                singleRoom,
                doubleRoom,
                suiteRoom
        );
    }
}