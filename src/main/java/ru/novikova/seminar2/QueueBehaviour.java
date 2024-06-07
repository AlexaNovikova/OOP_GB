package ru.novikova.seminar2;

public interface QueueBehaviour {
    void giveOrders();
    void releaseFromQueue();
    void takeInQueue(Actor actor);
    void takeOrders();
}
