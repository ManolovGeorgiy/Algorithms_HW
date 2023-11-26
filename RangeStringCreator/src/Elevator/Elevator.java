package Elevator;

import java.util.ArrayList;
import java.util.List;

class Elevator {
    private int currentFloor;

    public Elevator(int currentFloor) {
        this.currentFloor = currentFloor;
    }

    public void moveToFloor(int targetFloor) {
        System.out.println("Moving elevator to floor " + targetFloor);
        currentFloor = targetFloor;
    }

    public int getCurrentFloor() {
        return currentFloor;
    }
}

class ElevatorSystem {
    private List<Elevator> elevators = new ArrayList<>();

    public ElevatorSystem(int numElevators) {
        if (numElevators < 1) {
            System.out.println("Error: Number of elevators should be at least 1.");
            return;
        }

        for (int i = 0; i < numElevators; i++) {
            elevators.add(new Elevator(0));
        }
    }

    public Elevator findNearestElevator(int requestedFloor) {
        if (elevators.isEmpty()) {
            System.out.println("Error: No elevators in the system.");
            return null;
        }

        int minDistance = Integer.MAX_VALUE;
        Elevator nearestElevator = null;

        for (Elevator elevator : elevators) {
            int distance = Math.abs(elevator.getCurrentFloor() - requestedFloor);
            if (distance < minDistance) {
                minDistance = distance;
                nearestElevator = elevator;
            }
        }

        return nearestElevator;
    }
}

 class ElevatorSystemExample {

    public static void main(String[] args) {
        int numElevators = 2;

        ElevatorSystem elevatorSystem = new ElevatorSystem(numElevators);

        if (elevatorSystem.findNearestElevator(1) != null) {
            Elevator elevatorA = elevatorSystem.findNearestElevator(1);
            Elevator elevatorB = elevatorSystem.findNearestElevator(8);

            System.out.println("Sending elevator A to floor 1");
            elevatorA.moveToFloor(1);
        }
    }
}
