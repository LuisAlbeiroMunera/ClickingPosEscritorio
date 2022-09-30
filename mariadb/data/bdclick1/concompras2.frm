TYPE=VIEW
query=(select `bdclick1`.`bdcompra`.`producto` AS `producto`,sum(`bdclick1`.`bdcompra`.`cantidad`) AS `cant`,`bdclick1`.`bdingreso`.`anulada` AS `anulada`,month(`bdclick1`.`bdingreso`.`fechaFactura`) AS `mes`,year(`bdclick1`.`bdingreso`.`fechaFactura`) AS `ano`,sum(`bdclick1`.`bdcompra`.`subtotal`) AS `total`,sum(`bdclick1`.`bdcompra`.`total`) AS `totalSimplificado` from (`bdclick1`.`bdingreso` left join `bdclick1`.`bdcompra` on((`bdclick1`.`bdcompra`.`ingreso` = `bdclick1`.`bdingreso`.`id`))) group by `bdclick1`.`bdcompra`.`producto`,`bdclick1`.`bdingreso`.`anulada`,month(`bdclick1`.`bdingreso`.`fechaFactura`),year(`bdclick1`.`bdingreso`.`fechaFactura`) having (`bdclick1`.`bdingreso`.`anulada` = 0))
md5=da118ce4004360cfd2a722fb80de4e12
updatable=0
algorithm=0
definer_user=root
definer_host=localhost
suid=1
with_check_option=0
timestamp=2019-11-13 21:34:32
create-version=2
source=(select `bdcompra`.`producto` AS `producto`,sum(`bdcompra`.`cantidad`) AS `cant`,`bdingreso`.`anulada` AS `anulada`,month(`bdingreso`.`fechaFactura`) AS `mes`,year(`bdingreso`.`fechaFactura`) AS `ano`,sum(`bdcompra`.`subtotal`) AS `total`,sum(`bdcompra`.`total`) AS `totalSimplificado` from (`bdingreso` left join `bdcompra` on((`bdcompra`.`ingreso` = `bdingreso`.`id`))) group by `bdcompra`.`producto`,`bdingreso`.`anulada`,month(`bdingreso`.`fechaFactura`),year(`bdingreso`.`fechaFactura`) having (`bdingreso`.`anulada` = 0))
client_cs_name=utf8
connection_cl_name=utf8_general_ci
view_body_utf8=(select `bdclick1`.`bdcompra`.`producto` AS `producto`,sum(`bdclick1`.`bdcompra`.`cantidad`) AS `cant`,`bdclick1`.`bdingreso`.`anulada` AS `anulada`,month(`bdclick1`.`bdingreso`.`fechaFactura`) AS `mes`,year(`bdclick1`.`bdingreso`.`fechaFactura`) AS `ano`,sum(`bdclick1`.`bdcompra`.`subtotal`) AS `total`,sum(`bdclick1`.`bdcompra`.`total`) AS `totalSimplificado` from (`bdclick1`.`bdingreso` left join `bdclick1`.`bdcompra` on((`bdclick1`.`bdcompra`.`ingreso` = `bdclick1`.`bdingreso`.`id`))) group by `bdclick1`.`bdcompra`.`producto`,`bdclick1`.`bdingreso`.`anulada`,month(`bdclick1`.`bdingreso`.`fechaFactura`),year(`bdclick1`.`bdingreso`.`fechaFactura`) having (`bdclick1`.`bdingreso`.`anulada` = 0))
mariadb-version=100135
