TYPE=VIEW
query=(select `bdclick6`.`bdcompra`.`producto` AS `producto`,sum(`bdclick6`.`bdcompra`.`cantidad`) AS `cant`,`bdclick6`.`bdingreso`.`anulada` AS `anulada`,month(`bdclick6`.`bdingreso`.`fechaFactura`) AS `mes`,year(`bdclick6`.`bdingreso`.`fechaFactura`) AS `ano`,sum(`bdclick6`.`bdcompra`.`subtotal`) AS `total`,sum(`bdclick6`.`bdcompra`.`total`) AS `totalSimplificado` from (`bdclick6`.`bdingreso` left join `bdclick6`.`bdcompra` on((`bdclick6`.`bdcompra`.`ingreso` = `bdclick6`.`bdingreso`.`id`))) group by `bdclick6`.`bdcompra`.`producto`,`bdclick6`.`bdingreso`.`anulada`,month(`bdclick6`.`bdingreso`.`fechaFactura`),year(`bdclick6`.`bdingreso`.`fechaFactura`) having (`bdclick6`.`bdingreso`.`anulada` = 0))
md5=e056b61986f8703c5a0f44f42ec99b83
updatable=0
algorithm=0
definer_user=root
definer_host=localhost
suid=1
with_check_option=0
timestamp=2019-11-22 19:57:33
create-version=2
source=(select `bdcompra`.`producto` AS `producto`,sum(`bdcompra`.`cantidad`) AS `cant`,`bdingreso`.`anulada` AS `anulada`,month(`bdingreso`.`fechaFactura`) AS `mes`,year(`bdingreso`.`fechaFactura`) AS `ano`,sum(`bdcompra`.`subtotal`) AS `total`,sum(`bdcompra`.`total`) AS `totalSimplificado` from (`bdingreso` left join `bdcompra` on((`bdcompra`.`ingreso` = `bdingreso`.`id`))) group by `bdcompra`.`producto`,`bdingreso`.`anulada`,month(`bdingreso`.`fechaFactura`),year(`bdingreso`.`fechaFactura`) having (`bdingreso`.`anulada` = 0))
client_cs_name=utf8
connection_cl_name=utf8_general_ci
view_body_utf8=(select `bdclick6`.`bdcompra`.`producto` AS `producto`,sum(`bdclick6`.`bdcompra`.`cantidad`) AS `cant`,`bdclick6`.`bdingreso`.`anulada` AS `anulada`,month(`bdclick6`.`bdingreso`.`fechaFactura`) AS `mes`,year(`bdclick6`.`bdingreso`.`fechaFactura`) AS `ano`,sum(`bdclick6`.`bdcompra`.`subtotal`) AS `total`,sum(`bdclick6`.`bdcompra`.`total`) AS `totalSimplificado` from (`bdclick6`.`bdingreso` left join `bdclick6`.`bdcompra` on((`bdclick6`.`bdcompra`.`ingreso` = `bdclick6`.`bdingreso`.`id`))) group by `bdclick6`.`bdcompra`.`producto`,`bdclick6`.`bdingreso`.`anulada`,month(`bdclick6`.`bdingreso`.`fechaFactura`),year(`bdclick6`.`bdingreso`.`fechaFactura`) having (`bdclick6`.`bdingreso`.`anulada` = 0))
mariadb-version=100135
