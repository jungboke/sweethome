//package com.ssafy.home.util;
//
//import java.io.IOException;
//
//import javax.servlet.FilterChain;
//import javax.servlet.ServletException;
//import javax.servlet.http.HttpServletRequest;
//import javax.servlet.http.HttpServletResponse;
//
//import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
//import org.springframework.security.core.authority.AuthorityUtils;
//import org.springframework.security.core.context.SecurityContext;
//import org.springframework.security.core.context.SecurityContextHolder;
//import org.springframework.security.web.authentication.WebAuthenticationDetailsSource;
//import org.springframework.stereotype.Component;
//import org.springframework.util.StringUtils;
//import org.springframework.web.filter.OncePerRequestFilter;
//
//import lombok.RequiredArgsConstructor;
//import lombok.extern.slf4j.Slf4j;
//
//@Component
//@RequiredArgsConstructor
//@Slf4j
//public class JwtAuthenticationFilter extends OncePerRequestFilter{
//	
//	private final TokenProvider tokenProvider = new TokenProvider();
//	
//	@Override
//	protected void doFilterInternal(HttpServletRequest request, HttpServletResponse response, FilterChain filterChain)
//			throws ServletException, IOException {
//		// TODO Auto-generated method stub
//		try {
//			String token = parseBearerToken(request);
//			if(token!=null&&!token.equalsIgnoreCase("null")) {
//				String id = tokenProvider.validateAndGetUserId(token);
//				UsernamePasswordAuthenticationToken authentication = new UsernamePasswordAuthenticationToken(id, null,AuthorityUtils.NO_AUTHORITIES);
//				authentication.setDetails(new WebAuthenticationDetailsSource().buildDetails(request));
//				SecurityContext securityContext = SecurityContextHolder.createEmptyContext();
//				securityContext.setAuthentication(authentication);
//				SecurityContextHolder.setContext(securityContext);
//			}
//		} catch (Exception e) {
//			// TODO: handle exception
//		}
//		
//		filterChain.doFilter(request, response);
//	}
//
//	private String parseBearerToken(HttpServletRequest request) {
//		String bearerToken = request.getHeader("Authorization");
//		if(StringUtils.hasText(bearerToken)&&bearerToken.startsWith("Bearer")) {
//			return bearerToken.substring(7);
//		}
//		return null;
//	}
//	
//	
//}
