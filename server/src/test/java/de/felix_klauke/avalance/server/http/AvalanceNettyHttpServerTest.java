package de.felix_klauke.avalance.server.http;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

/**
 * @author Felix Klauke <fklauke@itemis.de>
 */
public class AvalanceNettyHttpServerTest {

    private AvalanceHttpServer avalanceNettyHttpServer;

    @Before
    public void setUp() {
        avalanceNettyHttpServer = new AvalanceNettyHttpServer(null);
    }

    @Test
    public void testStart() {
        assertFalse(avalanceNettyHttpServer.isRunning());

        avalanceNettyHttpServer.start();

        assertTrue(avalanceNettyHttpServer.isRunning());
    }

    @Test
    public void testIsRunning() {
        avalanceNettyHttpServer.start();

        assertTrue(avalanceNettyHttpServer.isRunning());

        avalanceNettyHttpServer.stop();

        assertFalse(avalanceNettyHttpServer.isRunning());
    }

    @Test
    public void testStop() {
        assertFalse(avalanceNettyHttpServer.isRunning());

        avalanceNettyHttpServer.start();

        assertTrue(avalanceNettyHttpServer.isRunning());

        avalanceNettyHttpServer.stop();

        assertFalse(avalanceNettyHttpServer.isRunning());
    }

    @After
    public void tearDown() throws Exception {
        avalanceNettyHttpServer.stop();

        Thread.sleep(1000);
    }
}