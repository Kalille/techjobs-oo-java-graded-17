package org.launchcode.techjobs.oo;

import org.junit.Test;

import static org.junit.Assert.*;

public class JobTest {
    //TODO: Create your unit tests here
    @Test
    public void testSettingJobId(){
        Job job1 = new Job();
        Job job2 = new Job();
        assertNotEquals(job1,job2);
    }

    @Test
    public void testJobConstructorSetsAllFields(){
        String name = "Product tester";
        Employer employer = new Employer("Acme");
        Location location = new Location("Desert");
        PositionType positionType = new PositionType("Quality control");
        CoreCompetency coreCompetency = new CoreCompetency("Persistence");

        Job job = new Job(name, employer, location, positionType, coreCompetency);
        assertEquals(job.getName(),name);
        assertEquals(job.getEmployer(), employer);
        assertEquals(job.getLocation(), location);
        assertEquals(job.getPositionType(),positionType);
        assertEquals(job.getCoreCompetency(), coreCompetency);
        assertTrue(job instanceof Job);
    }

    @Test
    public void testJobsForEquality(){
       Job job1 = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
        Job job2 = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
        assertFalse(job1.equals(job2));
    }
}
