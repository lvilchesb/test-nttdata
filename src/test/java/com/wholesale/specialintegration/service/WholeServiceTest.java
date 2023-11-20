package com.wholesale.specialintegration.service;

import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.mockito.runners.MockitoJUnitRunner;
import org.springframework.test.util.ReflectionTestUtils;

import com.wholesale.specialintegration.domain.Usuario;
import com.wholesale.specialintegration.exception.WholeException;

@RunWith(MockitoJUnitRunner.class)
public class WholeServiceTest {
    @Mock
    private WholeServiceBD wholeServiceBD;
    @InjectMocks
    private WholeService wholeService;

    @Before
    public void init() {
        MockitoAnnotations.initMocks(this);
        ReflectionTestUtils.setField(wholeService, "messageFormatMail", "messageFormatMail");
        ReflectionTestUtils.setField(wholeService, "validaMail", "validaMail");
        ReflectionTestUtils.setField(wholeService, "validaPassword", "validaPassword");
        ReflectionTestUtils.setField(wholeService, "messagePassword", "messagePassword");
        ReflectionTestUtils.setField(wholeService, "messageRequest", "messagePassword");
    }

    @Test
    public void testGetWhole() throws WholeException {
        Assert.assertNotNull("NOT NULL", wholeService.getWhole(new Usuario()));
        Assert.assertNotNull("NOT NULL", wholeService.getWhole(null));
    }

    @Test
    public void testPostWhole() throws WholeException {
        Usuario user = new Usuario();
        user.setCorreo("juan@rodriguez.com");
        Assert.assertNotNull("NOT NULL", wholeService.postWhole(user));
        Assert.assertNotNull("NOT NULL", wholeService.postWhole(null));
    }

    @Test
    public void testPutWhole() throws WholeException {
        Usuario user = new Usuario();
        user.setCorreo("juan@rodriguez.com");
        user.setContrasena("Qhunter2");
        Assert.assertNotNull("NOT NULL", wholeService.putWhole(user));
        Assert.assertNotNull("NOT NULL", wholeService.putWhole(null));
    }

    @Test
    public void testDeleteWhole() throws WholeException {
        Usuario user = new Usuario();
        user.setCorreo("juan@rodriguez.com");
        Assert.assertNotNull("NOT NULL", wholeService.deleteWhole(user));
        Assert.assertNotNull("NOT NULL", wholeService.deleteWhole(null));
    }

}
