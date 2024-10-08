package Junit;

import static org.mockito.Mockito.*;
import static org.junit.jupiter.api.Assertions.*;

import java.sql.Connection;
import java.sql.Statement;
import java.sql.SQLException;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

class TestMysql {

    @Mock
    private Connection mockConnection;

    @Mock
    private Statement mockStatement;

    @InjectMocks
    private MysqlSample test1; // The class under test

    @BeforeEach
    public void setUp() throws Exception {
        MockitoAnnotations.openMocks(this); // Initializes the mocks
    }

    @Test
    void testDatabaseInsert() throws SQLException {
        // Setup (Arrange)
        when(mockConnection.createStatement()).thenReturn(mockStatement);
        when(mockStatement.executeUpdate(anyString())).thenReturn(1); // Simulate 1 row inserted

        // Execute the method under test
        int rowsInserted = mockStatement.executeUpdate("insert into author values('A010','Ravichandran')");

        // Assertions (Assert)
        assertEquals(1, rowsInserted, "Row insertion failed!");

        // Verify interactions with the mock objects
        verify(mockStatement, times(1)).executeUpdate("insert into author values('A010','Ravichandran')");
    }
}