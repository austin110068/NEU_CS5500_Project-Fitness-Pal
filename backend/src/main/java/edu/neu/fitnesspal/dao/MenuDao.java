package edu.neu.fitnesspal.dao;

import edu.neu.fitnesspal.bean.MainMenu;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author valentinzhao
 * @since 2021/4/8
 */

@Repository
public interface MenuDao {
    public List<MainMenu> getMainMenus();
}
