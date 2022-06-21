package de.tum.in.ase.eist;

import org.junit.jupiter.api.*;

import java.net.MalformedURLException;
import java.net.URL;

import static org.junit.jupiter.api.Assertions.*;

class OnlineCourseTest {

	// 3: Test setOnlineCourseUrl()
    @Test
    void testSetOnlineCourseUrlWithValidUrl() {
        OnlineCourse onlineCourse = new OnlineCourse("Netflix");
        onlineCourse.setUrl("www.netflix.com");
        URL expected = new URL("https://www.netflix.com/");
        URL observed = onlineCourse.getUrl();
        assertEquals(expected, observed);
    }

    @Test
    void testSetOnlineCourseUrlWithInvalidUrl() throws MalformedURLException {
        OnlineCourse onlineCourse = new OnlineCourse("Netflix");
        assertThrows(MalformedURLException.class, () -> { onlineCourse.setUrl("www.netflix.comdsdsd"); });
    }
}
