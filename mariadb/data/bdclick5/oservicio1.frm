TYPE=VIEW
query=select `bdclick5`.`bdoservicio1`.`idFactura` AS `idFactura`,`bdclick5`.`bddetalleordenservicio`.`ordenServicio` AS `ordenServicio`,`bdclick5`.`bddetalleordenservicio`.`nombreParte` AS `nombreParte`,`bdclick5`.`bddetalleordenservicio`.`inventario` AS `inventario`,`bdclick5`.`bddetalleordenservicio`.`problemasDerecha` AS `problemasDerecha`,`bdclick5`.`bddetalleordenservicio`.`problemasIzquierda` AS `problemasIzquierda`,`bdclick5`.`bddetalleordenservicio`.`observaciones` AS `observaciones`,`bdclick5`.`bddetalleordenservicio`.`num` AS `num` from (`bdclick5`.`bdoservicio1` join `bdclick5`.`bddetalleordenservicio` on((`bdclick5`.`bdoservicio1`.`idFactura` = `bdclick5`.`bddetalleordenservicio`.`ordenServicio`))) group by `bdclick5`.`bdoservicio1`.`idFactura`,`bdclick5`.`bddetalleordenservicio`.`ordenServicio`,`bdclick5`.`bddetalleordenservicio`.`nombreParte`,`bdclick5`.`bddetalleordenservicio`.`inventario`,`bdclick5`.`bddetalleordenservicio`.`problemasDerecha`,`bdclick5`.`bddetalleordenservicio`.`problemasIzquierda`,`bdclick5`.`bddetalleordenservicio`.`observaciones`,`bdclick5`.`bddetalleordenservicio`.`num`
md5=7aa9848fa5b19cb6cb3876851c78c32c
updatable=0
algorithm=0
definer_user=root
definer_host=localhost
suid=1
with_check_option=0
timestamp=2019-11-22 19:46:48
create-version=2
source=select `bdoservicio1`.`idFactura` AS `idFactura`,`bddetalleordenservicio`.`ordenServicio` AS `ordenServicio`,`bddetalleordenservicio`.`nombreParte` AS `nombreParte`,`bddetalleordenservicio`.`inventario` AS `inventario`,`bddetalleordenservicio`.`problemasDerecha` AS `problemasDerecha`,`bddetalleordenservicio`.`problemasIzquierda` AS `problemasIzquierda`,`bddetalleordenservicio`.`observaciones` AS `observaciones`,`bddetalleordenservicio`.`num` AS `num` from (`bdoservicio1` join `bddetalleordenservicio` on((`bdoservicio1`.`idFactura` = `bddetalleordenservicio`.`ordenServicio`))) group by `bdoservicio1`.`idFactura`,`bddetalleordenservicio`.`ordenServicio`,`bddetalleordenservicio`.`nombreParte`,`bddetalleordenservicio`.`inventario`,`bddetalleordenservicio`.`problemasDerecha`,`bddetalleordenservicio`.`problemasIzquierda`,`bddetalleordenservicio`.`observaciones`,`bddetalleordenservicio`.`num`
client_cs_name=utf8
connection_cl_name=utf8_general_ci
view_body_utf8=select `bdclick5`.`bdoservicio1`.`idFactura` AS `idFactura`,`bdclick5`.`bddetalleordenservicio`.`ordenServicio` AS `ordenServicio`,`bdclick5`.`bddetalleordenservicio`.`nombreParte` AS `nombreParte`,`bdclick5`.`bddetalleordenservicio`.`inventario` AS `inventario`,`bdclick5`.`bddetalleordenservicio`.`problemasDerecha` AS `problemasDerecha`,`bdclick5`.`bddetalleordenservicio`.`problemasIzquierda` AS `problemasIzquierda`,`bdclick5`.`bddetalleordenservicio`.`observaciones` AS `observaciones`,`bdclick5`.`bddetalleordenservicio`.`num` AS `num` from (`bdclick5`.`bdoservicio1` join `bdclick5`.`bddetalleordenservicio` on((`bdclick5`.`bdoservicio1`.`idFactura` = `bdclick5`.`bddetalleordenservicio`.`ordenServicio`))) group by `bdclick5`.`bdoservicio1`.`idFactura`,`bdclick5`.`bddetalleordenservicio`.`ordenServicio`,`bdclick5`.`bddetalleordenservicio`.`nombreParte`,`bdclick5`.`bddetalleordenservicio`.`inventario`,`bdclick5`.`bddetalleordenservicio`.`problemasDerecha`,`bdclick5`.`bddetalleordenservicio`.`problemasIzquierda`,`bdclick5`.`bddetalleordenservicio`.`observaciones`,`bdclick5`.`bddetalleordenservicio`.`num`
mariadb-version=100135