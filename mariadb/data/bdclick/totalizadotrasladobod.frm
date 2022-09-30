TYPE=VIEW
query=select `bdclick`.`bdproductos`.`idSistema` AS `codigo`,sum(if(isnull(`bdclick`.`trasladobod`.`cantidad`),\'0\',`bdclick`.`trasladobod`.`cantidad`)) AS `Expr1` from (`bdclick`.`bdproductos` left join `bdclick`.`trasladobod` on((`bdclick`.`bdproductos`.`idSistema` = `bdclick`.`trasladobod`.`producto`))) group by `bdclick`.`bdproductos`.`idSistema`
md5=a24ce03d7ea067a64505e0b72e48fcc0
updatable=0
algorithm=0
definer_user=root
definer_host=localhost
suid=1
with_check_option=0
timestamp=2019-09-20 15:58:30
create-version=2
source=select `bdproductos`.`idSistema` AS `codigo`,sum(if(isnull(`trasladobod`.`cantidad`),\'0\',`trasladobod`.`cantidad`)) AS `Expr1` from (`bdproductos` left join `trasladobod` on((`bdproductos`.`idSistema` = `trasladobod`.`producto`))) group by `bdproductos`.`idSistema`
client_cs_name=utf8
connection_cl_name=utf8_general_ci
view_body_utf8=select `bdclick`.`bdproductos`.`idSistema` AS `codigo`,sum(if(isnull(`bdclick`.`trasladobod`.`cantidad`),\'0\',`bdclick`.`trasladobod`.`cantidad`)) AS `Expr1` from (`bdclick`.`bdproductos` left join `bdclick`.`trasladobod` on((`bdclick`.`bdproductos`.`idSistema` = `bdclick`.`trasladobod`.`producto`))) group by `bdclick`.`bdproductos`.`idSistema`
mariadb-version=100135
