package com.taxi;

import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.bean.Booking;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class BookingServlet
 */
@WebServlet("/BookingServlet")
public class BookingServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public BookingServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
           
            
		Date time=null;
		Date date=null;
		// TODO Auto-generated method stub
		Booking booking=new Booking();
		booking.setDestination(request.getParameter("destination"));
		booking.setSource(request.getParameter("source"));
		
		//try {
			//date = new SimpleDateFormat("MM/DD/YYYY", Locale.ENGLISH).parse(request.getParameter("pickUpDate"));
		//} 
                /*catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}*/
		/*booking.setPickUpTime(time);
		booking.setPickUpDate(date);*/
		System.out.println(request.getSession(false)+"sesssssssssssssssion");
                HttpSession session=request.getSession();
              
                if(session.isNew())
                {
                    session.invalidate();
                }
                
               if(request.getSession(false)==null)
               {
                   RequestDispatcher view = request.getRequestDispatcher("SignIn.jsp");
		view.forward(request, response);
               }
                if(request.getSession(false)!=null)
                {RequestDispatcher view = request.getRequestDispatcher("CarOptions.jsp");
		view.forward(request, response);}
	}

}
