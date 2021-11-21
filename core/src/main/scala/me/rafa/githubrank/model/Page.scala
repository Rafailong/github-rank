package me.rafa.githubrank.model

case class Page[A](paging: Paging, total: Int, elem: List[A])