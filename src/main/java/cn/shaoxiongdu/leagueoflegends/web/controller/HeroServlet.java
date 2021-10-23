package cn.shaoxiongdu.leagueoflegends.web.controller;

import cn.shaoxiongdu.leagueoflegends.bean.Hero;
import cn.shaoxiongdu.leagueoflegends.bean.Page;
import cn.shaoxiongdu.leagueoflegends.service.HeroService;
import cn.shaoxiongdu.leagueoflegends.service.impl.HeroServiceImpl;
import cn.shaoxiongdu.leagueoflegends.utils.FormatUtils;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.awt.print.Book;
import java.io.IOException;
import java.util.List;

/**
 * @description:
 * @author: shaoxiongdu <email@shaoxiongdu.cn>
 * @date: 2021-10-23 | 17:12
 */
@WebServlet("/heroServlet")
public class HeroServlet extends BaseServlet{

    HeroService heroService = new HeroServiceImpl();


    public void queryAll(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        List<Hero> heroList = heroService.queryAll();

        req.setAttribute("heroList",heroList);

        req.getRequestDispatcher("/jsp/hero/heroList.jsp").forward(req,resp);;

    }

    public void detail(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        String id = req.getParameter("id");

        Hero hero = heroService.queryHeroById(id);

        req.setAttribute("hero",hero);

        req.getRequestDispatcher("/jsp/hero/heroDetal.jsp").forward(req,resp);;

    }
}
