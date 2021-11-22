package me.rafa.githubrank.model

import me.rafa.githubrank.model.PagingControls.Paging

case class Page[A](paging: Paging, total: Int, elem: List[A])
