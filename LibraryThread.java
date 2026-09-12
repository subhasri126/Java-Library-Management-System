class LibraryThread extends Thread {

    public void run() {

        try {
            Thread.sleep(500);

            System.out.println(
                "Library System: Background task completed."
            );

        } catch (InterruptedException e) {
            System.out.println("Thread interrupted.");
        }
    }
}